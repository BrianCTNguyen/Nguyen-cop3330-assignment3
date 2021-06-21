package oop.assignment3.ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment2 Solution
 *  Copyright 2021 Brian Nguyen
 */

import java.io.*;
import java.util.Scanner;

public class solution43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String currentPath, author, siteName;

        char js = 'N';
        char css = 'N';

        //function to output and scan input

        System.out.print("Site name: ");
        siteName = in.nextLine();

        System.out.print("Author: ");
        author = in.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        js = in.next().charAt(0);

        System.out.print("Do you want a folder for CSS? ");
        css = in.next().charAt(0);

        //create website folder on current directory

        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        //create file object

        File website = new File(currentPath);

        //create the folder for siteName

        boolean websiteCreated = website.mkdir();
        if(websiteCreated) {
            System.out.println("Created " + currentPath);
            try {

                //writing to the index.html file

                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\"" + author + "\">\n");
                skeletonWriter.write("\t<title>" + siteName + "</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();
                System.out.println("Created " + currentPath + "\\index.html");
                if(js == 'y' || js == 'Y') {
                    File jsFolder = new File(currentPath +"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated) {
                        System.out.println("Created " + jsFolder + "\\");
                    }
                }
                if(css == 'y' || css == 'Y') {
                    File cssFolder = new File(currentPath +"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated) {
                        System.out.println("Created " + cssFolder + "\\");
                    }
                }
            }
            // if nothing else is created, return;

            catch(IOException e) {
                return;
            }
        }
        in.close();
    }
}
