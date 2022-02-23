package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj swoje imię: ");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();
        System.out.println("Podaj nazwisko");
        scanner.nextLine();
        String nazwisko = scanner.nextLine();

        System.out.println(String.format("Witaj %s %s mający lat %s", a, nazwisko, wiek));
    }
}
