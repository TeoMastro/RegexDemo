/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexpressions;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 *
 * @author teo
 */
public class RegexMethods {
    
    public static void returnRegex(){
    //setting the directory where we will search
    System.out.println("Give the path of the directory you want to search");
    String directory = UserInput.getString();
    File f = new File(directory);
    //regex with which we search in the directory
    System.out.println("Give a regex");
    String reg = UserInput.getString();
    Pattern pattern = Pattern.compile(reg);
    //the files that match our results
    File[] matchingFiles;
        matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        
    //Display the results
    for(int i=0;i<matchingFiles.length;i++){
        System.out.println(matchingFiles[i]);
    }
    }
    
    public static void returnTxt(){
    //setting the directory where we will search
    System.out.println("Give the path of the directory you want to search");
    String directory = UserInput.getString();
    File f = new File(directory);
    //regex with which we search in the directory
    String reg = ".*.txt";
    Pattern pattern = Pattern.compile(reg);
    //the files that match our results
    File[] matchingFiles;
        matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        
    //Display the results
    for(int i=0;i<matchingFiles.length;i++){
        System.out.println(matchingFiles[i]);
    }
    }
    
}
