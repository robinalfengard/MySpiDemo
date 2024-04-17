package provider;

import service.BmiCalculate;


public class ImperialBmiCalculator implements BmiCalculate {



    @Override
    public String getResult(double height, double weight) {
        double bmi = weight/(height*height) * 703;
        return "Your BMI is: " + bmi;
    }
}
