package provider;


import service.BmiCalculate;
import service.NamingAnnotation;

@NamingAnnotation(name = "Metric")
public class MetricBmiCalculator implements BmiCalculate {


    @Override
    public String getResult(float height, float weight) {
        height = height / 100;
        float bmi = weight/(height*height);
        return "Your BMI is: " + String.format("%.2f",bmi);
    }
}
