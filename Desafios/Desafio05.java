import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio05 {
    //Heron's formula
    //Write an app that reads the lengths of the sides of the triangle from the user.
    //Compute the area of the triangle using Heron's formula in which 's' represents
    //half of the perimeter of the triangle, and 'a' and 'b' and 'c' are the lengths of
    //the three sides. Print area to the three decimal placas.
    // A = sqrt(s(s-a)*(s-b)*(s-c))
    public static void main(String[] args) {
        Scanner scannerSide1 = new Scanner(System.in);
        Scanner scannerSide2 = new Scanner(System.in);
        Scanner scannerSide3 = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.###");

        Double side1, side2, side3;
        Double result;
        System.out.println("Put the value of the first side:");
        side1 = scannerSide1.nextDouble();
        System.out.println("Put the value of the second side:");
        side2 = scannerSide2.nextDouble();
        System.out.println("Put the value of the third side:");
        side3 = scannerSide3.nextDouble();
        
        result = heronsArea(side1, side2, side3);
        System.out.println("The area is: " + decimal.format(result));

        scannerSide1.close();scannerSide2.close();scannerSide3.close();        
    }
    
    public static double heronsArea(Double side1, Double side2, Double side3) {
        Double area;
        Double semiPerimeter;
        semiPerimeter = (side1 + side2 + side3)/2;
        
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        Math.round(area);
        return area;
    }
}
