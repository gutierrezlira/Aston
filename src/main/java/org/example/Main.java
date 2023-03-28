package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число (или 0 для выхода): ");
            number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            }
        } while (number != 0);
    }*/
}