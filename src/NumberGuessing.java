import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){

        System.out.println("Give nme random number");

        Scanner guessedNumber=new Scanner(System.in);
        int input=guessedNumber.nextInt();

        int pickedNumber;

        pickedNumber = (int)(Math.random()*100);

        System.out.println(pickedNumber);

        if (pickedNumber<input){

            System.out.println("The number you put is higher");
        }
    else if (pickedNumber>input){

            System.out.println("The number you have picked is lower");


        }
        if(pickedNumber==input){

            System.out.println("you have guessed the right number");

        }


    }

}
