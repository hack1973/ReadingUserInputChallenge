package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");
            if (scanner.hasNextInt()) {
                sum = sum + scanner.nextInt();
                count = count + 1;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle Enter key
        }
        scanner.close();
        System.out.println("Sum = " + sum);
    }
}