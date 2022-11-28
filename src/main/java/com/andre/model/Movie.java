package com.andre.model;

import com.google.gson.JsonObject;

public class Movie {
  private final String TITLE;
  private final int RELEASE;
  private final double RESPONSE;
  private final String GENRE;
  private final String[] CAST;

  public Movie(String title, int release,double response, String genre, String[] cast){
    this.TITLE = title;
    this.RELEASE = release;
    this.RESPONSE = response;
    this.GENRE = genre;
    this.CAST = cast;
  }



  public String getTitle() {
    return TITLE;
  }

  public int getRelease() {
    return RELEASE;
  }

  public String getGenre() {
    return GENRE;
  }

  public String[] getCast() {
    return CAST;
  }

  @Override
  public String toString(){
    return "Назва фільму: " + TITLE +
            "\nРік виходу: " + RELEASE +
            "\nВідгук" + RESPONSE +
            "\nЖанр: " + GENRE +
            "\nВ головних ролях: " + CAST;
  }
}
