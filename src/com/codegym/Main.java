package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 10;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle 1");
            System.out.println("2. Draw the triangle 2");
            System.out.println("3. Draw the triangle 3");
            System.out.println("4. Draw the triangle 4");
            System.out.println("5. Draw the triangle 5");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("");
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("");
                        for (int j = 0; j <= 5 - i; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 3:
                    int i = 5;
                    int j = 5;
                    for (i = 0; i <= 5; i++) {
                        System.out.println(" ");
                        for (j = 0; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (j = 6 - i; j <= 6; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 4:
                    for (i = 0; i <= 5; i++) {
                        System.out.println(" ");
                        for (j = 0; j <= i; j++) {
                            System.out.print("  ");
                        }
                        for (j = i; j <= 5; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 5:
                    for (i = 0; i <= 5; i++) {
                        System.out.println(" ");
                        for (j = 0; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (j = 6 - i; j <= 6; j++) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("");
        }
    }
}
