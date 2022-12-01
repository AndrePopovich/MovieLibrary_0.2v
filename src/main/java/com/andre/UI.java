package com.andre;

import com.andre.model.Root;
import com.andre.model.User;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class UI {
  private String num;
  private String login;
  private char[] readPassword;
  private boolean check;
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private Console cnsl = System.console();


  //private char[] securityPassword;

  public void UserInterface() throws IOException{
    System.out.println(ANSI_PURPLE +"_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    System.out.println("_-_-_-_ Вітаємо Вас в КІНОТЕЦІ!!! _-_-_-_");
    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + ANSI_RESET);
    startMenu();
  }

  public void startMenu() throws IOException {
    Scanner s = new Scanner(System.in);
      System.out.println(ANSI_BLUE+"\n\n_-_-_-_ ПОЧАТКОВЕ МЕНЮ _-_-_-_" +ANSI_YELLOW+ "\n1. Авторизація" + "\n2. Регістрація" +
          "\n3. Переглянути список фільмів" + "\n4. Вихід з програми");
      System.out.print(ANSI_CYAN+"Оберіть варіант входу: " + ANSI_RESET);
      num = s.nextLine();
      switch (num) {
        case "1":
          if (cnsl == null) {
            System.out.println(ANSI_RED + "Немає доступу до консолі");
            break;
          }
          System.out.print(ANSI_BLUE+"Введіть логін: ");
          login = s.nextLine();
          readPassword = cnsl.readPassword(ANSI_YELLOW+"Введіть пароль: ");
          User user = new User(login, new String(readPassword));
          check = user.Authorization();
          if (check) {
            System.out.println(ANSI_GREEN+"Ви успішно ввійшли в акаунт!!!");
            mainMenu();
          } else {
            System.out.println(ANSI_RED+"Невірний логін або пароль!!!");
            startMenu();
          }
          break;

        case "2":
          if (cnsl == null) {
            System.out.println(ANSI_RED + "Немає доступу до консолі");
            break;
          }
          System.out.print(ANSI_BLUE+"Введіть новий логін: ");
          login = s.nextLine();
          readPassword = cnsl.readPassword(ANSI_YELLOW+"Введіть новий пароль: ");
          User newUser = new User(login, new String(readPassword));
          check = newUser.Registration();
          if (check) {
            System.out.println(ANSI_GREEN+"Ви успішно зареєструвалися!!!" + ANSI_RESET);
            startMenu();
          } else {
            System.out.println(ANSI_RED+"Такий акаунт уже існує!!!" + ANSI_RESET);
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
          System.out.println(ANSI_RED+"Неправильний вибір!!! Спробуйте ще раз..." + ANSI_RESET);
          startMenu();
          break;
      }
  }

  public void mainMenu() throws IOException {
    System.out.println(ANSI_BLUE+"\n\n_-_-_-_ ГОЛОВНЕ МЕНЮ _-_-_-_" + ANSI_YELLOW+
        "\n1. Переглянути список фільмів" +
        "\n2. ТОП-10 фільмів обраного жанру" +
        "\n3. Сортувати фільми по рейтингу" +
        "\n4. Показати список фільмів обраного жанру" +
        "\n5. Вихід з акаунту" +
        "\n6. Вихід з програми" + ANSI_RESET);
    Scanner s = new Scanner(System.in);
    JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
    System.out.print(ANSI_CYAN+"Оберіть варіант з меню: " + ANSI_RESET);
    num = s.nextLine();
    switch (num){
      case "1":
        viewList();
        mainMenu();
        break;
      case "2":
        System.out.println(ANSI_PURPLE+"\n1. Жахи" + ANSI_CYAN+"\n2. Комедії" +ANSI_PURPLE+
            "\n3. Драми" + ANSI_CYAN+"\n4. Документальні" + ANSI_RESET);
        System.out.print(ANSI_CYAN+"Оберіть жанр: "+ANSI_RESET);
        num = s.nextLine();
        switch (num){
          case "1":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Horror","2").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "2":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Comedy","2").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "3":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Drama","2").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "4":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Documentary","2").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          default:
            System.out.println(ANSI_RED+"Невірні дані!!!" + ANSI_RESET);
            break;
        }
        mainMenu();

        break;
      case "3":
        System.out.println(ANSI_BLUE+"\n1. Сортувати по зростанню" +ANSI_YELLOW+ "\n2. Сортувати по спаданню" + ANSI_RESET);
        System.out.print(ANSI_CYAN+"Оберіть вид сортування: "+ANSI_RESET);
        num = s.nextLine();
        switch (num){
          case "1":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("","3").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "2":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("","4").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          default:
            System.out.println(ANSI_RED+"Невірні дані!!!" + ANSI_RESET);
            break;
        }
        mainMenu();
        break;
      case "4":
        System.out.println(ANSI_BLUE+"\n1. Жахи"+ANSI_YELLOW + "\n2. Комедії" +ANSI_BLUE+
            "\n3. Драми"+ANSI_YELLOW + "\n4. Документальні" +ANSI_BLUE+ "\n5. Історичні"
            +ANSI_YELLOW+ "\n6. Сімейні"+ANSI_BLUE+
            "\n7. Трілери");
        System.out.print(ANSI_CYAN+"Оберіть жанр: " + ANSI_RESET);
        num = s.nextLine();
        switch (num){
          case "1":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Horror","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "2":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Comedy","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "3":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Drama","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "4":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Documentary","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "5":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Historical","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "6":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Family","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          case "7":
            System.out.println(ANSI_CYAN + jsonSimpleParser.parseTop("Thriller","5").toString().replaceAll("]", "").replaceAll("\\[", ""));
            break;
          default:
            System.out.println(ANSI_RED+"Невірні дані!!!" + ANSI_RESET);
            break;
        }
        mainMenu();
        break;
      case "5":
        startMenu();
        break;
      case "6":
        System.exit(0);
      default:
        System.out.println(ANSI_RED+"Неправильний вибір!!! Спробуйте ще раз..." + ANSI_RESET);
        mainMenu();
        break;
    }
  }

  private void viewList(){
    Scanner s = new Scanner(System.in);
    System.out.println(ANSI_CYAN+"\nОберіть рік випуску, щоб побачити список фільмів" + ANSI_RESET);

    int year = 1999;
    for (int i = 0; i <= 18; i++) {
      year++;
      System.out.println(ANSI_YELLOW + (i + 1) + ". Фільми " + year + " року");
    }
    JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
    System.out.print(ANSI_CYAN+"Оберіть номер в списку: ");
    int select = s.nextInt();
    if (select > 0 && select < 19) {
      year = 1999;
      year = year + select;
      Root root = jsonSimpleParser.parse(new String(Integer.toString(year)));
      System.out.println(root.toString().replaceAll("]", "").replaceAll("\\[", ""));
    } else {
      System.out.println(ANSI_RED+"Невірні дані!!!" + ANSI_RESET);
    }
  }

}
