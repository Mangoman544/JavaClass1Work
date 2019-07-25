
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println(" Here comes a quiz. No cheating!");
        
        System.out.println(" Question 1: What is the capital of California? ");
        System.out.println(" \ta) San Francisco ");
        System.out.println(" \tb) Sacramento ");
        System.out.println(" \tc) Los Angeles ");
        System.out.println(" \tb) San Jose ");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("b")) {
            System.out.println(" That is correct! ");
            rightAnswers++;
        }
        else {
            System.out.println(" Sorry, the captital is actually Sacramento! ");
        }
        
        System.out.println(" Question 2: What is my favorite color? ");
        System.out.println(" \ta) Blue ");
        System.out.println(" \tb) White ");
        System.out.println(" \tc) Rainbow ");
        System.out.println(" \td) Red ");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("b")) {
            System.out.println(" That is correct! ");
            rightAnswers++;
        }
        else {
            System.out.println(" Wrong! My favorite color actually is White, which is essentially the absence of color, but whatever. ");
        }        
        System.out.println(" Your score is " + rightAnswers + " out of 2 questions. ");
    
        
    
    
    
    
    
    
    
    }
        
}
