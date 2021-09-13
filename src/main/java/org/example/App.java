package org.example;
import java.util.*;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App {
    public static void main(String[] args) {

// create a hashmap
        HashMap<String, String> Login = new HashMap<String, String>();

// using Object put(Object key, Object value) method

        Login.put("bread", "crumbs");
        Login.put("door", "county");
        Login.put("hello", "kitty");
        Login.put("george", "Washington");

//printing the hashmap
        String username;
        String password;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        username = input.nextLine();


        if (Login.containsKey(username)) {
            String a = Login.get(username);
            System.out.println("Please enter your password: ");
            password = input.nextLine();
            if (password.equals(a)) {
                System.out.println("Welcome!");
            }
            else{
                    System.out.println("I don't know you.");
                }
            }
        else{
            System.out.println("I don't know you.");
        }
    }
}
