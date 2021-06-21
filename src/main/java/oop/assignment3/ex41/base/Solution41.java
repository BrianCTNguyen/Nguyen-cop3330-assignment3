package oop.assignment3.ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;

import static oop.assignment3.ex41.base.NameSorter.readNames;

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         reading the text input file
         using a Scanner input = new Scanner("fileName.txt")
         */

        Scanner in = new Scanner(new File("exercise41_input.txt"));

        // declaring an array for storing names (x = new ArrayList<String>)

        ArrayList<String> names;
        names = new ArrayList<>();

        // implement read input and sort the names nameSorter()

        readNames(in, names);

        in.close();

        try {
            outputNames(names);
        }

        catch (Exception e) {
            System.out.println();
        }

    }

    /* class outside the main to output in the outputFile
    public static void outputTheNames()
     */
    public static void outputNames(ArrayList<String> names) throws IOException {

        // create a something to output to file ( FileWriter("fileName.txt") )

        FileWriter output = new FileWriter("exercise41_output.txt");

        /* create a function that prints an output that matches example

               Total of x names
            -------------------- */

        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        for (String i : names) {

            output.write(i + "\n");

        }

        output.close();

    }
}

