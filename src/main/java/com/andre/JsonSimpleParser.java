package com.andre;

import com.andre.create.CreateMovies;
import com.andre.model.Cast;
import com.andre.model.Movie;
import com.andre.model.Root;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Це клас, який буде парсити наші файл
 */
public class JsonSimpleParser {
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

  /**
   * Цей метод призначений щоб парсити файл
   * @param yearRelease приймає в себе рік фільмів
   * @return повертає список фільмів
   */
  public Root parse(String yearRelease){
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

  /**
   * Цей метод є універсальним, тому що він може фільтрувати та сортувати дані
   * @param genres приймає жанр фільму
   * @param select приймає вибір користувача
   * @return повертає список фільмів
   */
  public List<Movie> parseTop(String genres,String select){
    List<Movie> moviesList = new ArrayList<>();
    if(!directory.exists()){
      System.out.println("Бібліотеку створено!!! Спробуйте ще раз...");
      CreateMovies createMovies = new CreateMovies();
      createMovies.createDirectories();
      System.exit(0);

    }else {
      for(int i = 2000; i<2019;i++){
        String PATH = "Movies/"+ Integer.toString(i) +"/movies.json";
        Root root = new Root();
        JSONParser parser = new JSONParser();


        try(FileReader reader = new FileReader(PATH)) {
          JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

          long year = (long) rootJsonObject.get(TAG_YEAR);
          JSONArray moviesJsonArray = (JSONArray) rootJsonObject.get(TAG_MOVIES);



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
        }catch (Exception ex){
          ex.printStackTrace();
        }
        if(select.equals("2")){
          moviesList = moviesList.stream()
              .sorted(Comparator.comparingDouble(Movie::getResponse).reversed())
              .filter(element-> element.getGenre().equals(genres))
              .limit(10)
              .collect(Collectors.toList());
        }
        else if(select.equals("3")){
          moviesList = moviesList.stream()
              .sorted(Comparator.comparingDouble(Movie::getResponse))
              .collect(Collectors.toList());
        }
        else if(select.equals("4")){
          moviesList = moviesList.stream()
              .sorted(Comparator.comparingDouble(Movie::getResponse).reversed())
              .collect(Collectors.toList());
        }
        else if(select.equals("5")){
          moviesList = moviesList.stream()
              .filter(element-> element.getGenre().equals(genres))
              .collect(Collectors.toList());
        }


      }
    }

    return moviesList;
  }

}
