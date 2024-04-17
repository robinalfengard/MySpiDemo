package consumer;
import service.BmiCalculate;
import java.io.IOException;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws IOException {

        // Letar efter interfacet Greeting
        ServiceLoader<BmiCalculate> loader = ServiceLoader.load(BmiCalculate.class);

        System.out.println("Welcome to the Bmi Calculator \nPlease enter select if you want to use Metric or Imperial units");
        System.out.println("1. Imperial \n2. Metric");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(choice.equals("1")){
            System.out.println("Enter your height in inches");
            String height = sc.nextLine();
            System.out.println("Enter your weight in pounds");
            String weight = sc.nextLine();
            for(BmiCalculate g : ServiceLoader.load(BmiCalculate.class)) {
                if(g.getClass().getSimpleName().equals("ImperialBmiCalculator")) {
                    System.out.println(g.getResult(Integer.parseInt(height), Integer.parseInt(weight)));
                }
            }
        } else if(choice.equals("2")){
            System.out.println("Enter your height in cm");
            String height = sc.nextLine();
            System.out.println("Enter your weight in kg");
            String weight = sc.nextLine();
            for(BmiCalculate g : ServiceLoader.load(BmiCalculate.class)) {
                if(g.getClass().getSimpleName().equals("MetricBmiCalculator")) {
                    System.out.println(g.getResult(Integer.parseInt(height), Integer.parseInt(weight)));
                }
            }
        } else {
            System.out.println("Wrong input");
        }




/*        for(BmiCalculate g : loader) {
            var annotation =  g.getClass().getDeclaredAnnotation(Adress.class);
            if(annotation != null){
                System.out.println(annotation);
            } else {
                System.out.println("Annotation was null");
            }
            System.out.println(g.getResult("Robin"));
        }*/


        ServiceLoader<BmiCalculate> loader2 = ServiceLoader.load(BmiCalculate.class);


 /*       for(BmiCalculate g : loader2) {
            System.out.println(g.getResult("Robin"));
        }*/

    }

}

