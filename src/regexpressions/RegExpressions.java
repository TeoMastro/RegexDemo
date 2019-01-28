/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexpressions;

/**
 *
 * @author teo
 */
public class RegExpressions {
    public static void main(String[] args) {
        boolean flag=true;
        do{
            System.out.println("CHOOSE A NUM");
            System.out.println("1--Write your own regex");
            System.out.println("2--Find .txt files in the directory you choose");
            System.out.println("0--Exit the program");
            int n = UserInput.getInteger();
            switch(n){
                case 1:
                    try{
                        RegexMethods.returnRegex();
                    }
                    catch(Exception e){
                        System.out.println("Your regex or the path was wrong");
                    }
                    break;
                case 2:
                    try{
                        RegexMethods.returnTxt();
                    }
                    catch(Exception e){
                        System.out.println("Your regex or the path was wrong");
                    }
                    break;
                case 0:
                    System.out.println("Exiting... ");
                    flag=false;
                    break;
                default:
                    System.out.println("Wrong choice of number");
            }
            
        }
        while(flag);
    }
    
}
