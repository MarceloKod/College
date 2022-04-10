import java.util.Random;

public class Desafio08 {
    //Write an app that generates a random integer in the range of 20 to 40,
    //Displays the sine, cosine, and tangent of that number.
    public static void main(String[] args) {
        int number;
        Double sine,cosine,tangent;
        Random rand = new Random();
        number = rand.nextInt(21) + 20;
        sine = Math.sin(number);
        cosine = Math.cos(number);
        tangent = Math.tan(number);
        
        System.out.println("The sine of the number " + number + " is " + sine);
        System.out.println("The cosine of the number " + number + " is " + cosine);
        System.out.println("The tangent of the number " + number + " is " + tangent);
    }   
    
}
