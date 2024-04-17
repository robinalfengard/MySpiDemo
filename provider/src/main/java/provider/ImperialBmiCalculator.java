package provider;

import service.BmiCalculate;
import service.NamingAnnotation;


@NamingAnnotation(name = "Imperial")
public class ImperialBmiCalculator implements BmiCalculate {

    @Override
    public String getResult(float height, float weight) {
        float bmi = weight/(height*height) * 703;
        return "Your BMI is: " + String.format("%.2f",bmi);
    }
}
