package com.company;
import java.util.Stack;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("enter the string:");
        Scanner sc=new Scanner(System.in);
        String inputstring=sc.nextLine();
        Stack Stack=new Stack();
        for(int i=0;i<inputstring.length();i++)
        {
            Stack.push(inputstring.charAt(i));
        }
        String reverseString=" ";
        while(!Stack.isEmpty())
        {
            reverseString=reverseString+Stack.pop();
        }
        if(inputstring.equals(reverseString))

            System.out.print("the input string is a palindrome");
        else
            System.out.print("the input is not a palindrome");

    }
}
