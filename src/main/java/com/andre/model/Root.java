package com.andre.model;

import java.util.List;

public class Root {
  private int year;
  private List<Movie> movies;
  @Override
  public String toString(){
    return "Рік випуску: " + year+ "\nФільми: " + movies;
  }

  public int getYear() {
    return year;
  }
  public List<Movie> getMovies() {
    return movies;
  }


  public void setYear(int year) {
    this.year = year;
  }

  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }
}
