import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = 21;
        System.out.println("Guess the number?");

        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        if (number > secretNumber){
            System.out.println("The number is too high");
        } else if (number < secretNumber){
            System.out.println("The number is too low");
        } else {
            System.out.println("You have guessed correctly!");
        }
    }
}
