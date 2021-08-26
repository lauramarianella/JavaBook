/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_12.ExceptionHandlingAndTextIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class _12_16_ReplaceText {
    static String path = "C:\\Users\\laura\\NetBeansProjects\\CH12TextIO\\";
    public static void main(String[] args) throws Exception {
        String[] myValues = {path+"scores.txt", path+"scoresResult.txt", "yy", "zz"};
        
        // Check command line parameter usage
        //args = args2;
        /*if (args.length != 4) {
          System.out.println(
            "Usage: java ReplaceText sourceFile targetFile oldStr newStr");
          System.exit(1);
        }*/

        // Check if source file exists
        File sourceFile = new File(myValues[0]);
        if (!sourceFile.exists()) {
          System.out.println("Source file " + myValues[0] + " does not exist");
          System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(myValues[1]);
        /*if (targetFile.exists()) {
          System.out.println("Target file " + args[1] + " already exists");
          System.exit(3);
        }*/

        try (
          // Create input and output files
          Scanner input = new Scanner(sourceFile);
          PrintWriter output = new PrintWriter(targetFile);
        ) {        
          while (input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(myValues[2], myValues[3]);
            output.println(s2);
          }
        }
    }
}