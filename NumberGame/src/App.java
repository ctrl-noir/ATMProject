import java.util.Scanner;
import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----WELCOME TO THE NUMBER GUESSING GAME----");
        System.out.println("----RULES-----");
        System.out.println("1. Guess the correct number from a range of 1-100. \n2. Hints will be given depending on guess.\n3. Aim for the lowest score possible.\n4. There is a total of four rounds. Your score accumulates each round.");

        Random rand = new Random();
       

        int score = 0;

        for(int i = 1; i < 4; i++){
            System.out.println("ROUND: " + i);
            int randNum = rand.nextInt(100) + 1;
            while(true){
            
                System.out.println("Insert your guess: ");
                Scanner sc = new Scanner(System.in);
                int guess = sc.nextInt();
                System.out.println("Random Number: " + randNum);

                if(randNum == guess){
                    System.out.println("----CONGRATULATIONS YOU WIN!---");
                    System.out.println("------SCORE: " + score);
                    break;
                } else if (randNum < guess){
                    System.out.println("Hint: The number is lower.");
                    score++;
                } else if (randNum > guess){
                    System.out.println("Hint: The number is higher.");
                    score++;
                }
            }
        } 
    }    
}

//{}