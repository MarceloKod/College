import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio07 {
    //Volume and surface of Sphere
    //Write a app that reads the radius of a sphere and prints its volume and suface area.
    //Print the output to four decima places
    public static void main(String[] args) {
        Double area,volume;
        Scanner scannerRadius = new Scanner(System.in);
        DecimalFormat descForm = new DecimalFormat("0.####");

        System.out.println("Put the value of the radius:");
        double radius = scannerRadius.nextDouble();

        area = area(radius);
        System.out.println("Area = " + descForm.format(area));

        volume = volume(radius);
        System.out.println(("Volume = " + descForm.format(volume)));

        scannerRadius.close();
    }
    public static double area(Double radius) {
        double area = Math.pow(radius, 2)*4*Math.PI;

        return area;
    }
    public static Double volume(Double radius) {
        double volume = (Math.pow(radius, 3)*Math.PI*4)/3;
        
        return volume;
    }
}
