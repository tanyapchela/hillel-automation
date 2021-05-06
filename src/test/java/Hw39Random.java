import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hw39Random {
    public static void main(String[] args) {
        try {
            guessNumber();
        } catch (InputMismatchException exception) {
            System.out.println("It's not a number");
            guessNumber();
        }
    }

    public static void guessNumber() throws InputMismatchException {
        int randomNumber = new Random().nextInt(10);
        System.out.println(randomNumber);

        int number = new Scanner(System.in).nextInt();
        if (number == randomNumber) {
            System.out.println("Congrats");
        } else {
            System.out.println("Missed");
            guessNumber();
        }
    }

}
