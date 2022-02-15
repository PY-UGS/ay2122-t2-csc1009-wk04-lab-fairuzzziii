package OOPG.Week4;
import java.lang.Math;

public class BMI {
    private static double height;
    private static double weight;
    final static double kiloConversion = 0.45359237;
    final static double cmConversion = 0.0254;

    
    BMI(double newHeight, double newWeight){
        height = newHeight;
        weight = newWeight;
    }

    private double getHeight() {
        return height;
    }

    private double getWeight() {
        return weight;
    }

    protected void setHeight(double newHeight) {
        height = newHeight;
    }

    protected void setWeight(double newWeight) {
        weight = newWeight;
    }

    protected double getBMI(){
        double weightInKG = getWeight()*kiloConversion;
        double heightInMetre = getHeight()*cmConversion;
        double BMI = weightInKG/Math.pow(heightInMetre,2);
        return BMI;
    }

    protected String getBMIStatus(){
        if (getBMI()>= 30.0){
            String status = "Obese";
            return status;
        }
        else if (getBMI()<30.0 && getBMI()>= 25.0){
            String status = "Overweight";
            return status;
        }
        else if (getBMI()<25.0 && getBMI()>= 18.5)
        {
            String status = "Normal";
            return status;
        }
        else if (getBMI()<18.5){
            String status = "Underweight";
            return status;
        }
        else{
            String status = "Error with BMI input.";
            return status;
        }
    }


    
}
