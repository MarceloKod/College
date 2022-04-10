

import java.util.Random;
/*
Write a program that creates and prints a random phone number of the form xxx-xxx-xxxx.
Includes de dashes in the output. Do not let the first three digits contain an 8 or 9.
(but don't be more restrictive than that), and make sure that the second set of three digits is no greater than 742.
*/
public class Desafio01 {
    public static void main(String[] args) {
        int recive;
        Random number = new Random();
        //xxx-x-xxxx
        //012-4-6789
        for(int i =0; i<10; i++){
            //first set
            if(i<3){
                System.out.print(number.nextInt(8));
            }
            //third set
            else if(i > 5){
                System.out.print(number.nextInt(10));
            }
            else{
                if(i == 3 || i == 5){
                    System.out.print('-');
                }
                //second set
                if(i == 4){
                    recive = number.nextInt(743);
                    if(recive<100){
                        System.out.print(0);
                        if(recive < 10){
                            System.out.print(0);
                        }
                    }
                    System.out.print(recive);
                }
            }
        
        }
        
    }


}
