package com.andre.model;

import java.util.List;

public class Movie {
  private String title;
  private int release;


  private double responce;
  private String genre;
  private List<Cast> cast;

  public Movie(String title, int release,double response, String genre, List<Cast> cast){
    this.title = title;
    this.release = release;
    this.responce = response;
    this.genre = genre;
    this.cast = cast;
  }



  public String getTitle() {
    return title;
  }

  public int getRelease() {
    return release;
  }

  public String getGenre() {
    return genre;
  }

  public List<Cast> getCast() {
    return cast;
  }

  @Override
  public String toString(){
    return  "\n\nНазва фільму: " + title +
            "\nРік випуску: " + release +
            "\nВідгук: " + responce +
            "\nЖанр: " + genre +
            "\nВ головних ролях: " + cast;
  }
}
