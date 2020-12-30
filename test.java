package com.mycompany.parking;
import java.util.Scanner;


public class test {
    public static void main (String[]args) {
        ExitStation s = new ExitStation();

        System.out.println("enter your ID please");
        Scanner input =new Scanner(System.in);
         int id = input.nextInt();
        
         //allow user to enter start time (in hours)
        System.out.println("when you start parking here ?");
         double startTime = input.nextDouble();
        
        System.out.println("enter your vehicle type (C for car, B for Bus) :");
        char t = input.next().charAt(0);
                 
         System.out.println("thank you for parking here\n"+ "you should pay  " +s.calculateFee(t, startTime)+ "  $" );
 
    }

}
   
        

