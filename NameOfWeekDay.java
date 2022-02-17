import java.util.Scanner;

public class NameOfWeekDay {
    /*
    Question:
    Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
     */

    public static void main(String[] args) {
        // you know programming is about make it work anyhow
        // so there might be many ways & logics to do ..here is the one
        Scanner inputTaker = new Scanner(System.in);
        System.out.println("Enter no. :");
        int userInput = inputTaker.nextInt(); // instead of .nextInt() methode here we can also use nextInt(7) mean nextInt with radix that will take number below the radix only
        System.out.println("u entered "+userInput);
        if (userInput==1){
            System.out.println(userInput+"st day of the week is Sunday");
        }
        else if (userInput==2){
            System.out.println(userInput+"nd day of the week is Monday");
        }
        else if (userInput==3){
            System.out.println(userInput+"rd day of the week is Tuesday");
        }
        else if (userInput==4){
            System.out.println(userInput+"th day of the week is Wednesday");
        }
        else if (userInput==5){
            System.out.println(userInput+"th day of the week is Thrusday");
        }
        else if (userInput==6){
            System.out.println(userInput+"th day of the week is Friday");
        }
        else if (userInput==7){
            System.out.println(userInput+"th day of the week is Saturday");
        }
        else{
            System.out.println("Not a valid input , \n \t Please enter value only of the range 1 to 7 as there are only 7 days in a week..");
        }
        // As mentioned above there are many ways
        // --> similarly we can do this using making an array with the name of 7 days of a week and print the day name by comparing the user input with the corresponding index
        // --> Or there is a easy way using switch case statement which might be the best way to do , but if elese is my favourite one ;)
    }
}
