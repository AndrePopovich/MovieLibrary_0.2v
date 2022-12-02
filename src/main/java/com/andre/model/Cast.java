package com.andre.model;

/**
 * Клас ролей
 */
public class Cast {
  /**
   * Це зміна, яка зберігає ім'я та фамілію людини
   */
  private String fullName;

  /**
   * Конструктор
   * @param fullName приймає ім'я та фамілію людини
   */
  public Cast(String fullName){
    this.fullName = fullName;
  }

  /**
   * Метод, який повертає ім'я та фамілію людини
   * @return повертає ім'я та фамілію людини
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * Метод, який встановлює ім'я та фамілію людини
   * @param fullName приймає ім'я та фамілію людини
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Метод, який повертає ім'я та фамілію людини
   * @return повертає ім'я та фамілію людини
   */
  @Override
  public String toString(){
    return fullName;
  }
}
