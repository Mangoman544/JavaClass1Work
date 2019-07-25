
package userdata;

import java.util.Scanner;
public class UserData {
    static String name; // this is the variable
    int day;
    static String month;
    int year;
    static String book;
    static String hometown;
    
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        
        System.out.println( " What mouth were born? " );
        String month = keyboard.nextLine();
       
        System.out.println( " What year were you born in? " );
        int year = keyboard.nextInt();
        
        System.out.println( " What day were you born on? " );
        int day = keyboard.nextInt();
        
        System.out.println( " What is your favorite book of all time? " );
        String book = keyboard.nextLine();
        
        System.out.println( " What is your hometown called? " );
        String hometown = keyboard.nextLine();
        
        
        
    
    }
    
}
