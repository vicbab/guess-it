// Code written by @vicbab

import java.util.Scanner;
import java.util.Random;

public class guessit {
    public static int randInt(int min, int max){
        Random rand = new Random();
        
        int targetNumber = rand.nextInt((max - min) + 1) + min;
        
        return targetNumber;
    }
    
    public static void main(String[] args) {
        int targetNumber = randInt(1, 10000);
        Scanner guessInput = new Scanner(System.in);
        int guess = guessInput.nextInt();
        System.out.println(targetNumber);
        
        while(!(guess == targetNumber)){
            int diff = guess - 2000;
            int gapHigh = Math.abs(diff);
            int gapLow = guess + 2000;
            
            if(guess > targetNumber && gapHigh > targetNumber){
            
                System.out.println("Way Too High!");
            }
            else if(guess > targetNumber){
                System.out.println("Too High!");
            }

            else if(guess < targetNumber && gapLow < targetNumber){
                    
                System.out.println("Way too low!");
            }
            else if(guess < targetNumber){
                System.out.println("Too Low!");
            }
            guess = guessInput.nextInt();
        }
        System.out.println("Got it!");
    }
    
}
