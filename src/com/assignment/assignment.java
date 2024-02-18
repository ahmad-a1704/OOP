package com.assignment;

import java.util.*;

public class assignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        int yearOfBirth = currentYear - age;

        System.out.println("Hello " + name + "!");
        System.out.println("Your year of birth is: " + yearOfBirth + ".");

    }

}
