import java.util.Scanner;

public class Desafio04 {
/*
Write an application that reads the (x,y) coordinates for two points. Complete the distance between
the two points usnig a formula.
*/

    public static void main(String[] args) {

        Scanner scan1X = new Scanner(System.in);
        Scanner scan1Y = new Scanner(System.in);
        Scanner scan2X = new Scanner(System.in);
        Scanner scan2Y = new Scanner(System.in);

        //IMPUT
        System.out.println("What it's the value X on one of the points(point 1):");
        Double numberOneX = scan1X.nextDouble(); 
        System.out.println("What it's the value Y on one of the points(point 1):");
        Double numberOneY = scan1Y.nextDouble(); 
        System.out.println("What it's the value X on the other point(point 2):");
        Double numberTwoX = scan2X.nextDouble(); 
        System.out.println("What it's the value Y on the other point(point 2):");
        Double numberTwoY = scan2Y.nextDouble(); 

        //RESULT
        Double result = distanceBetweenTwoPoints(numberOneX, numberOneY, numberTwoX, numberTwoY);
        System.out.println("The result is: " + result);

        //CLOSE
        scan1X.close();scan1Y.close();scan2X.close();scan2Y.close();
    }

    //CALCULATE DISTANCE BETWEEN 2 POINTS (X, Y) ---- resturn Double
    public static Double distanceBetweenTwoPoints(Double XOne,Double YOne,Double XTow,Double YTwo) {
        Double distance, delX, delY;
        //Distance
        delX = (XOne - XTow);
        delY = (YOne - YTwo);
        
        distance = Math.sqrt(Math.pow(delX, 2) + Math.pow(delY, 2));
        
        return distance;
    }
}
