package com.company;

import models.*;
import service.*;

import java.util.Scanner;

public class Main {
    public static Cinema cinema;

    public static void main(String[] args) {

        cinema = new Cinema();

        System.out.println("Привет пользователь! Выбери действие:");
        System.out.println("1. Вход.");
        System.out.println("2. Регистрация.");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1: {
                loginMenu();
                break;
            }
            case 2: {
                registerMenu();
                break;
            }
            default:
                System.out.println("Вы ввели неверное значение меню...\n");
        }
    }
    public static void loginMenu() {
        user = new User();

        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String key;
        key = scanner.nexString();
        pupil.setLogin(key);


        boolean isCreated = findSuchUser(user);

        if (isCreated) {
            System.out.println("Вход успешный");
        } else {
            System.out.println("Попробуйте еще раз! Неверные данные! Такого пользователя не существует...");

            loginMenu();
        }
    }

    public static void registerMenu() {
        user = new User();

        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String key;
        key = scanner.nextString();
        user.setLogin(key);
        System.out.println("Пользователь добавлен успешно");
    }

    public static void mainMenu(String userName) {

        System.out.println("Hello " + userName + " !");

        System.out.println("Select an option:");
        System.out.println("1- Tom and Jery");
        System.out.println("2- Batman");
        System.out.println("3- 1+1");
        System.out.println("4- windows");

        Scanner scanner = new Scanner(System.in);


    }
}

