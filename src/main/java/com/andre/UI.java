package com.andre;

import com.andre.model.Root;
import com.andre.model.User;
import java.io.IOException;
import java.util.Scanner;

public class UI {
  private String num;
  private String login;
  private String password;
  private boolean check;


  //private char[] securityPassword;

  public void UserInterface() throws IOException{
    System.out.println("***** Вітаємо Вас в КІНОТЕЦІ!!! *****");
    startMenu();
  }

  public void startMenu() throws IOException {
    Scanner s = new Scanner(System.in);
      System.out.println("\n\n***** ПОЧАТКОВЕ МЕНЮ *****" + "\n1. Авторизація" + "\n2. Регістрація" +
          "\n3. Переглянути список фільмів" + "\n4. Вихід з програми");
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
            mainMenu();
          } else {
            System.out.println("Невірний логін або пароль!!!");
            startMenu();
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
            startMenu();
          } else {
            System.out.println("Такий акаунт уже існує!!!");
            startMenu();
          }

          break;

        case "3":
          viewList();
          startMenu();
          break;

        case "4":
          System.exit(0);

        default:
          System.out.println("Неправильний вибір!!! Спробуйте ще раз...");
          startMenu();
          break;
      }
  }

  public void mainMenu() throws IOException {
    System.out.println("\n\n***** ГОЛОВНЕ МЕНЮ *****" +
        "\n1. Переглянути список фільмів" +
        "\n2. ТОП-10 фільмів обраного жанру" +
        "\n3. Сортувати фільми по рейтингу" +
        "\n4. Показати список фільмів обраного жанру" +
        "\n5. Вихід з акаунту" +
        "\n6. Вихід з програми");
    Scanner s = new Scanner(System.in);
    num = s.nextLine();
    switch (num){
      case "1":
        viewList();
        mainMenu();
        break;
      case "2":
        break;
      case "3":
        break;
      case "4":
        break;
      case "5":
        startMenu();
        break;
      case "6":
        System.exit(0);
      default:
        System.out.println("Неправильний вибір!!! Спробуйте ще раз...");
        mainMenu();
        break;
    }
  }

  private void viewList(){
    Scanner s = new Scanner(System.in);
    System.out.println("\nОберіть рік випуску, щоб побачити список фільмів");

    int year = 1999;
    for (int i = 0; i <= 18; i++) {
      year++;
      System.out.println((i + 1) + ". Фільми " + year + " року");
    }
    JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
    int select = s.nextInt();
    if (select > 0 && select < 19) {
      year = 1999;
      year = year + select;
      Root root = jsonSimpleParser.parse(new String(Integer.toString(year)));
      System.out.println(root.toString().replaceAll("]", "").replaceAll("\\[", ""));
    } else {
      System.out.println("Невірні дані!!!");
    }
  }

}
