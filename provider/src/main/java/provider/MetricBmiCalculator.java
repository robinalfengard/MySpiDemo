package provider;


import service.BmiCalculate;



public class MetricBmiCalculator implements BmiCalculate {


    @Override
    public String getResult(double height, double weight) {
        height = height / 100;
        double bmi = weight/(height*height);
        return "Your BMI is: " + bmi;
    }
}
