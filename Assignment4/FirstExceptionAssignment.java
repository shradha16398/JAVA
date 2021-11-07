package ExceptionPacage;

import java.util.Scanner;

public class FirstExceptionAssifnment {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the numerator number");
        int n1 = sc1.nextInt();
        System.out.println("Enter the denominator number");
        int n2 = sc1.nextInt();
        try {
            int result = n1 / n2;
            System.out.println("division is :" + result);
        }catch (ArithmeticException e)
        {
            System.out.println("Number cannot divided by zero \n Enter valid number");
        }
    }
}
