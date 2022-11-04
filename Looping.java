// write a java program to print positive or negative.
import java.util.Scanner;

public class Looping{
    public static void main(String[] args) {

     
        Scanner su = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = su.nextInt();
        // true if number is less than 0
        if (number < 0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0
        else if ( number > 0)
            System.out.println(number + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0");
    }
}
