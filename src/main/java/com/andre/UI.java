package com.andre;

import com.andre.model.User;
import java.io.IOException;
import java.util.Scanner;

public class UI {
  private String num;
  private String login;
  private String password;
  private boolean check;
  //private char[] securityPassword;

  public void startMenu() throws IOException {
    Scanner s = new Scanner(System.in);
    System.out.println("***** Вітаємо Вас в КІНОТЕЦІ!!! *****\n");
    System.out.println("***** ПОЧАТКОВЕ МЕНЮ *****" + "\n1. Авторизація" + "\n2. Регістрація" +
        "\n3. Переглянути список всіх фільмів" + "\n4. Вихід з програми");
    System.out.print("Оберіть варіант входу: ");
    num = s.nextLine();
    switch (num) {
      case "1":

        System.out.print("Введіть логін: ");
        login = s.nextLine();
        System.out.print("Введіть пароль: ");
        password = s.nextLine();
        User user = new User(login, password);
        check = user.Authorization();
        if (check) {
          System.out.println("Ви успішно ввійшли в акаунт!!!");
        } else {
          System.out.println("Невірний логін або пароль!!!");
        }
        break;
      case "2":
        System.out.print("Введіть новий логін: ");
        login = s.nextLine();
        System.out.print("Введіть новий пароль: ");
        password = s.nextLine();
        User newUser = new User(login, password);
        check = newUser.Registration();
        if (check) {
          System.out.println("Ви успішно зареєструвалися!!!");
        } else {
          System.out.println("Такий акаунт уже існує!!!");
        }

        break;
      case "3":
        //List
        break;
      case "4":
        System.exit(0);
      default:
        System.out.println("Неправильний вибір!!! Спробуйте ще раз...");
        break;
    }

  }

  public void mainMenu() {
    System.out.println("Ви ввійшли в меню");
  }

}
