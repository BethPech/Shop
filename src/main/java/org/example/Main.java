package org.example;

import java.util.Scanner;

import static org.example.User.getMenu;

public class Main {
    public static void main(String[] args) {

        User client = new User("123", "123");

        Scanner scanner = new Scanner(System.in);
        Product[] card = new Product[10];
        System.out.println("Авторизация \n Введите логин и пароль пользователя:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }

    }
}
