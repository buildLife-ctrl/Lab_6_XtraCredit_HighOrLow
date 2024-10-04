import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        Random rand = new Random();
        int randomValue;
        int inputGuess;
        boolean check = false;

        //randomizes the int value
        randomValue = rand.nextInt(10) + 1;

        //checks for valid input
        do {
            //asks for the user to guess the randomized number
            System.out.println("Guess an integer between 1 and 10. You only get one chance, so answer carefully.");
            if (scan.hasNextInt()) {
                inputGuess = scan.nextInt();
                if (inputGuess > 0 && inputGuess < 11) {
                    check = true; //breaks the loop
                    //compares the input and the randomizer number
                    System.out.println("My number was " + randomValue + ".");
                    if (inputGuess == randomValue) {
                        System.out.println("Congrats! You have guessed right!");
                    } else {
                        System.out.println("Whoops, that's not it!");
                    }
                } else {
                    System.out.println("Please enter a valid input value.");
                }
            } else {
                System.out.println("You have entered the wrong data type, please try again.");
            }
            scan.nextLine();
        } while (!check);
    }
}