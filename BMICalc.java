/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalc;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class BMICalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int weight, inches, height;
        double heightInMeters;
        
        System.out.print("Your height in feet? ");
        height = keyboard.nextInt();
        
        System.out.print("Your inches in feet? ");
        inches = keyboard.nextInt();
        
        System.out.print("Your weight in pounds? ");
        weight = keyboard.nextInt();
        
        heightInMeters = (height / 3.28) * (height / 3.28);
        System.out.println("Your BMI is " + (weight / 2.2) / heightInMeters);
        
    }
    
}
