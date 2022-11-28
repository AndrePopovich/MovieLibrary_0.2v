package com.andre.model;

import java.util.List;

public class Root {
  private String year;
  private List<Movie> movies;
  @Override
  public String toString(){
    return "Рік виходу: " + year+ "\nФільми: " + movies;
  }

  public String getYear() {
    return year;
  }
  public String getMovies() {
    return movies.toString();
  }


  public void setYear(String year) {
    this.year = year;
  }

  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }
}
