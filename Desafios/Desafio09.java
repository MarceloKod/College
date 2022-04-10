import java.text.DecimalFormat;
import java.util.Random;

public class Desafio09 {
    //Write an app that generate a random integer radius(r) and height (h)
    //for a cylinder in the range 1 to 10, inclusive, and then computes the
    //volume and surface area of the cylinder
    public static void main(String[] args) {
        Random rand = new Random();
        int r,h;
        Double area;
        Double volume;

        DecimalFormat decForm = new DecimalFormat();
        r = rand.nextInt(11)+1;
        h = rand.nextInt(11)+1;

        System.out.println("The radius is: " + r);
        System.out.println("The height: " + h);

        area = surfaceAreaCylinder(r, h);
        System.out.println("Area surface: " + decForm.format(area));

        volume = volumeCylinder(r, h);
        System.out.println("Volume: " + decForm.format(volume));
    }
    public static Double surfaceAreaCylinder(int radius, int height) {
        Double area;
        area = 2*(Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius * height);
        
        return area;
    }
    public static Double volumeCylinder(int radius, int height) {
        Double volume;
        volume = Math.PI*Math.pow(radius, 2)*height;
        return volume;
    }
}
