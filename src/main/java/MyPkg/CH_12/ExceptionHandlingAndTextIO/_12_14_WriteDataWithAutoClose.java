/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.io.IOException;

public class _12_14_WriteDataWithAutoClose {
    static String path = "C:\\Users\\laura\\NetBeansProjects\\CH12TextIO\\";
    public static void main(String[] args) /*throws Exception*/ {
        java.io.File file = new java.io.File(path + "scores.txt");
        /*if(file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }*/

        try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {/* Create a file*/
            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }catch(IOException io){
            System.out.print(io.toString());
        }
    }
}