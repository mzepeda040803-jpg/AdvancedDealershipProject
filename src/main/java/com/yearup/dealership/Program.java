package com.yearup.dealership;

import java.util.Scanner;

public class Program {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.display();
    }
}
