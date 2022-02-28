package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int height;

       // do while statement
        do
        {
            System.out.print("Enter Height between 3 & 8-->");
            height = key.nextInt();

        }
        while(height > 8 || height < 3);


        //loop
        for (int i= 1; i<= height; i++)
        {
            for (int j=1; j<=height-i; j++)
            {
                System.out.print(".");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }}}

