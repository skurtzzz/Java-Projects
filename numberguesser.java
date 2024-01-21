import java.util.Scanner;
import java.util.Random;
    public class numberguesser{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int guess;
            char response;
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            do{
            System.out.print("\nGuess a number from 1-100: ");
            guess = in.nextInt();
            if(guess == randomNumber){
                System.out.println("Correct! The number is: " + randomNumber);
            }
            else if(guess > randomNumber){
                System.out.println("Incorrect! Guess a little lower. ");
            }
            else if(guess < randomNumber){
                System.out.println("Incorrect! Guess a little higher. ");
            }
            System.out.print("\nDo you still want to guess? ");
            response = in.next().charAt(0);
        }while(response == 'Y' || response == 'y');
        System.out.println("The correct answer is: " + randomNumber);
        }
    }