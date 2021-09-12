package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        String quote, arthur;
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        quote = input.nextLine();
        System.out.println("Who said it?");
        arthur = input.nextLine();
        System.out.println(arthur + " says, " + "\"" + quote + "\"");
    }
}
