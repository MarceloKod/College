import java.util.Scanner;

public class Desafio02 {
    //Write a program that prints tha sum of cubes.
    //Prompt for and read two integes values and print the sum
    //of each value raised to the third power.
    public static void main(String[] args) {
        Scanner imput1 = new Scanner(System.in);
        Scanner imput2 = new Scanner(System.in);

        System.out.println("Put the first integer: ");
        Double number1 = imput1.nextDouble();
        System.out.println("Put the second integer: ");
        Double number2 = imput2.nextDouble();

        sumOfCubes(number1, number2);

        imput2.close();
        imput1.close();
    }
    public static void sumOfCubes(Double first, Double second) {
        // int total = (first*first*first) + (second*second*second);
        Double total = Math.pow(first, 3) + Math.pow(second,3);
        //returns the value of the first argument raised to the power of the second argument.
        System.out.println("The sum of the cubes from " + first + " and " + second + " is " + total );
    }
}
