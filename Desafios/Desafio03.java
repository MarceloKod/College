import java.util.Random;
import java.util.Scanner;

public class Desafio03 {
    //Write a program that prompts for and reads the user's first name and last name(separately)
    //Then print a string composed f the first letter of the user's first name, followed by
    //the fist five characters of the user's last name, followed by a random number in the range 10 to 99.
    public static void main(String[] args) {
        Scanner scnName = new Scanner(System.in);
        Scanner scnLastName = new Scanner(System.in);
        String code;

        System.out.println("Put your first name: ");
        String name = scnName.next().toUpperCase();
        
        System.out.println("Put your last name: ");
        String lastName = scnName.next().toLowerCase();

        // while(lastName.length()< 5){
        //     System.out.println("The last name must be 5 chracters long. Try again:");
        //     lastName = scnLastName.next();
        // }

        int numeros;
        Random numRandom = new Random();
        numeros = numRandom.nextInt(90)+10;

        code = name.substring(0,1);
        if(lastName.length()<5){
            code += lastName.substring(0, lastName.length());
        }
        else{
            code += lastName.substring(0,5);
            }
        code += numeros;

        System.out.println("You code is: ");
        System.out.println(code);

        scnLastName.close();
        scnName.close();
    }
}
