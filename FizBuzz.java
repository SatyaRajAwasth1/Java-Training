import java.util.Scanner;

public class FizBuzz {
    /*
    Question:
    Write a Java Program that take input from user and print fizz if the user input number is divisible by 3,print buzz if the number is divisible by 5,and print fizzbuzz if the number is divisible by 3 and 5 simultaneously.
    */
    public static void main(String[] args) {
        // Before solving problem talk about logic to solving this
        /*
        --> Lets take user input and store it in a variable userInput
        --> Following question, lets check whether the userInput is divisible by 5  , divisible by 3 or by both 3 and 5
            & return the respective output by writing a code snippet within the block
              * to be exactly divisible by 3 or 5 reminder must be 0 (so condition wil be like) if(userInput%n==0) {...}
        --> Here we have to check multiple conditions so think like it can be done by if else ladder..
         */
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("Enter any Number to see the Magic: ");
        int userInput = inputTaker.nextInt();

        // check condition
        if (userInput%3==0 && userInput%5==0){
            System.out.println("FizBuzz");
        }
        else if (userInput%3==0){
            System.out.println("Fizz");
        }
        else if (userInput%5==0){
            System.out.println("Buzz");
        }
        else {
            System.out.println("Not divisible by 5 or 3 or invalid input");

        }
    }
}
