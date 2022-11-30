package com.andre;

import com.andre.model.Cast;
import com.andre.model.Movie;
import com.andre.model.Root;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleParser {
  //private final String PATH = "Movies/2018/movies.json";

  private final String TAG_MAIN_YEAR = "year";
  private final String TAG_MOVIES = "movies";
  private final String TAG_TITLE = "title";
  private final String TAG_YEAR = "year";
  private final String TAG_RESPONSE = "response";
  private final String TAG_CAST = "cast";
  private final String TAG_GENRE = "genres";
  private final String TAG_FULL_NAME = "fullName";

  public Root parse(String yearRelease){
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
    return null;
  }
  public List<Movie> parseTop(String genres,String select){
    List<Movie> moviesList = new ArrayList<>();
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
    return moviesList;
  }

}
