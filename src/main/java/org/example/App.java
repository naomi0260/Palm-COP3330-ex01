package org.example;

import java.util.Scanner;

/*
    Name: Naomi Palm
    Class: COP3330
    Date:6/3/2021
    Assignment:example 01
*/
public class App 
{
    static Scanner input = new Scanner(System.in);

    public static void main( String[] args )
    {
        App newApp = new App();

        String name = newApp.getName();
        String outPut = newApp.createOutput(name);
        newApp.print(outPut);

    }

    private String getName(){
        System.out.print("What is your name: ");
        return input.nextLine();
    }

    private String createOutput(String name){
        return "Hello, " + name + ", nice to meet you!";
    }

    private void print(String outPut){
        System.out.print(outPut);
    }
}
