package provider;


import service.BmiCalculate;
import service.NamingAnnotation;

import java.util.Scanner;

@NamingAnnotation(name = "Metric")
public class MetricBmiCalculator implements BmiCalculate {


    @Override
    public String getResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm");
        String height = sc.nextLine();
        System.out.println("Enter your weight in kg");
        String weight = sc.nextLine();
        float heightInCm = (float) Integer.parseInt(height) / 100;
        float bmi = (float) Integer.parseInt(weight) / ( heightInCm*heightInCm);
        return "Your BMI is: " + String.format("%.2f",bmi);
    }
}
