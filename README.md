# Mario
package com.company;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
           // write your code here
        Scanner key = new Scanner(System.in);

        int h = 0;
        System.out.println("What is the height of the pyramid? ");
        h = key.nextInt();

        while (h < 1 || h > 8)
        {
            System.out.println("The height must be a whole number between one and eight. Try again: ");
            h = key.nextInt();
        }


        // dots
        for (int i = 1; i <= h; i++) {


            for (int s = 0; s < h - i; s++)
            {
                System.out.print(" ");
            }

            // print pyramid
            for (int x = 1; x <= i; x++)
            {
                System.out.print("#");

            }
            System.out.println("");
        }}}
