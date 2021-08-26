/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.util.Scanner;

public class _12_17_ReadFileFromURL {
    public static void main(String[] args) {
        boolean isUsingUserInput=false;
        String URLString = "https://www.google.com/index.html";
        if(isUsingUserInput){
            System.out.println("Enter a URL: ");
            URLString = new Scanner(System.in).next();
        }
        try {
            java.net.URL url = new java.net.URL(URLString); 
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            } 

            System.out.println("The file size is " + count + " characters");
        }catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }catch (java.io.IOException ex) {
            System.out.println("IO Errors");
        }
    }
}   