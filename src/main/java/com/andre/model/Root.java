package com.andre.model;

import java.util.List;

/**
 * Клас, який зберігає повні дані про фільм
 */
public class Root {
  /**
   * Це зміна, яка зберігає рік фільмів
   */
  private int year;
  /**
   * Це зміна, яка зберігає список фільмів
   */
  private List<Movie> movies;
  /**
   * Метод, який повертає ім'я та фамілію людини
   * @return повертає ім'я та фамілію людини
   */
  @Override
  public String toString(){
    return "Рік випуску: " + year+ "\nФільми: " + movies;
  }
  /**
   * Метод, який повертає ім'я та фамілію людини
   * @return повертає ім'я та фамілію людини
   */
  public int getYear() {
    return year;
  }
  /**
   * Метод, який повертає ім'я та фамілію людини
   * @return повертає ім'я та фамілію людини
   */
  public List<Movie> getMovies() {
    return movies;
  }

  /**
   * Метод, який назначає змінну year
   * @param year приймає рік
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Метод, який назначає змінну movies
   * @param movies приймає список фільмів
   */
  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }
}
