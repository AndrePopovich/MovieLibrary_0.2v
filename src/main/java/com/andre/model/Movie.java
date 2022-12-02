package com.andre.model;

import java.util.List;

/**
 * Клас фільмів
 */
public class Movie {
  /**
   * Змінна, яка зберігає назву фільма
   */
  private String title;
  /**
   * Змінна, яка зберігає рік фільма
   */
  private int release;
  /**
   * Змінна, яка зберігає відгук фільма
   */
  private double response;
  /**
   * Змінна, яка зберігає жанр фільма
   */
  private String genre;
  /**
   * Змінна, яка зберігає список ролей фільма
   */
  private List<Cast> cast;
  /**
   * Метод конструктор
   */

  public Movie(String title, int release,double response, String genre, List<Cast> cast){
    this.title = title;
    this.release = release;
    this.response = response;
    this.genre = genre;
    this.cast = cast;
  }


  /**
   * Метод, який повертає назву фільма
   * @return повертає назву фільма
   */
  public String getTitle() {
    return title;
  }
  /**
   * Метод, який повертає рік фільма
   * @return повертає рік фільма
   */
  public int getRelease() {
    return release;
  }
  /**
   * Метод, який повертає відгук фільма
   * @return повертає відгук фільма
   */
  public double getResponse() {
    return response;
  }
  /**
   * Метод, який повертає жанр фільма
   * @return повертає жанр фільма
   */
  public String getGenre() {
    return genre;
  }
  /**
   * Метод, який повертає список ролей фільма
   * @return повертає список ролей фільма
   */
  public List<Cast> getCast() {
    return cast;
  }
  /**
   * Метод, який повертає інформацію
   * @return повертає інформацію
   */
  @Override
  public String toString(){
    return  "\n\nНазва фільму: " + title +
            "\nРік випуску: " + release +
            "\nВідгук: " + response +
            "\nЖанр: " + genre +
            "\nВ головних ролях: " + cast;
  }
}
