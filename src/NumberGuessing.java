
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        System.out.println("Give " +
                "" +
                "me random number");

        Scanner guessedNumber = new Scanner(System.in);
        Integer input;

        int pickedNumber;

        pickedNumber = (int) (Math.random() * 100);






        do {
            input = guessedNumber.nextInt();

            if (pickedNumber < input) {

                System.out.println("The number you put is higher");


            } else if (pickedNumber > input) {

                System.out.println("The number you have picked is lower");


            }
            if (pickedNumber == input) {

                System.out.println("you have guessed the right number");


            }
            if (input==pickedNumber){
                System.out.println(pickedNumber);
            }

        }while (pickedNumber != input);

    }
}


