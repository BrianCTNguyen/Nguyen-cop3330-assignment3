package oop.assignment3.ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class solution42 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         reading the text input file
         using a Scanner input = new Scanner("fileName.txt")
         */

        Scanner in = new Scanner(new File("exercise42_input.txt"));

    }

    public static void outputValues(ArrayList<String> names) throws IOException {

        // create a function to output to file ( FileWriter("fileName.txt") )

        FileWriter output = new FileWriter("exercise41_output.txt");

        // include the parse method to modify exercise42_input.txt

        output.close();

    }

    /*
    Separate class to parse the date without CSV parser
     */
}
