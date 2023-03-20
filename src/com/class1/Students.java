package com.class1;

import java.util.Scanner;

public class Students {
    int id;
    String name;
    String email;

    public  void inputStudent(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        this.id = input.nextInt();

        System.out.println("Enter Student Name: ");
        this.name = input.nextLine();

        System.out.println("Enter Email: ");
        this.email = input.nextLine();

        System.out.println("Input completed!");
    }
    public  void displayStudents(){
        System.out.println("Student ID: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Email: " + this.email);
    }
}
