import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, \n \t Enter any number you wish its multiplication table:");
        int n = userInput.nextInt();


        System.out.println(" I know U just entered "+n+" Feel cool, Multiplication table of "+n+" is as:\n");
        for (int i = 1; i <=10; i++) {
            int result = n*i;
            System.out.println(n+" * "+i+"= "+result);

        }
    }
}
