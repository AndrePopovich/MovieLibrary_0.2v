package com.andre.crud;

import com.andre.create.CreateMovies;
import com.andre.model.Cast;
import com.andre.model.Movie;
import com.andre.model.Root;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Crud {
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_MAIN_YEAR = "year";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_MOVIES = "movies";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_TITLE = "title";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_YEAR = "year";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_RESPONSE = "response";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_CAST = "cast";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_GENRE = "genres";
  /**
   * Це зміна, яка зберігає тег
   */
  private final String TAG_FULL_NAME = "fullName";
  /**
   * Це зміна, яка зберігає директорію папки Movies
   */
  private File directory = new File("Movies");

  public void Create(){

  }
  public Root Read(String yearRelease){
    if(!directory.exists()){
      System.out.println("Бібліотеку створено!!! Спробуйте ще раз...");
      CreateMovies createMovies = new CreateMovies();
      createMovies.createDirectories();
      System.exit(0);

    }else {
      String PATH = "Movies/"+ yearRelease +"/movies.json";

      Root root = new Root();
      JSONParser parser = new JSONParser();


      try(FileReader reader = new FileReader(PATH)) {
        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

        long year = (long) rootJsonObject.get(TAG_YEAR);
        JSONArray moviesJsonArray = (JSONArray) rootJsonObject.get(TAG_MOVIES);

        List<Movie> moviesList = new ArrayList<>();


        for(Object items: moviesJsonArray){
          JSONObject movieJsonObject = (JSONObject) items;
          String title = (String) movieJsonObject.get(TAG_TITLE);
          long release = (long) movieJsonObject.get(TAG_MAIN_YEAR);
          double response = (double) movieJsonObject.get(TAG_RESPONSE);
          JSONArray castJsonArray = (JSONArray) movieJsonObject.get(TAG_CAST);
          String genre = (String) movieJsonObject.get(TAG_GENRE);

          List<Cast> castsList = new ArrayList<>();

          for(Object item: castJsonArray){
            JSONObject castJsonObject = (JSONObject) item;

            String fullName = (String) castJsonObject.get(TAG_FULL_NAME);
            Cast cast = new Cast(fullName);
            castsList.add(cast);
          }
          Movie movie = new Movie(title,(int)release,response,genre,castsList);
          moviesList.add(movie);
        }
        root.setYear((int)year);
        root.setMovies(moviesList);

        return root;
      }catch (Exception ex){
        ex.printStackTrace();
      }
    }

    return null;
  }
  public void Update(){

  }
  public void Delete(){

  }

}
