package com.andre.create;

import com.andre.model.Cast;
import com.andre.model.Movie;
import java.util.List;

public class CreateNewMovie extends Movie {
  /**
   * Метод конструктор
   *
   * @param title
   * @param release
   * @param response
   * @param genre
   * @param cast
   */
  public CreateNewMovie(String title, int release, double response, String genre,
      List<Cast> cast) {
    super(title, release, response, genre, cast);
  }
}
