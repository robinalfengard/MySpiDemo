package provider;

import service.BmiCalculate;
import service.NamingAnnotation;

import java.util.Scanner;


@NamingAnnotation(name = "Imperial")
public class ImperialBmiCalculator implements BmiCalculate {

    @Override
    public String getResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in full inches");
        String height = sc.nextLine();
        System.out.println("Enter your weight in full pounds");
        String weight = sc.nextLine();
        float bmi = (float) Integer.parseInt(weight) /(Integer.parseInt(height)*Integer.parseInt(height)) * 703;
        return "Your BMI is: " + String.format("%.2f",bmi);
    }
}
