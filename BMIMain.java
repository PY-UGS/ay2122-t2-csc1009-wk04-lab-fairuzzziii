package OOPG.Week4;
import java.util.Scanner;

public class BMIMain {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI test1 = new BMI(height, weight);
        System.out.println("BMI is " + test1.getBMI());
        System.out.println(test1.getBMIStatus());

        
    }
}
