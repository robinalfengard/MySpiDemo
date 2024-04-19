package consumer;
import service.BmiCalculate;
import service.NamingAnnotation;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<BmiCalculate> loader = ServiceLoader.load(BmiCalculate.class);

        String metric = null;
        String imperial = null;

        for (BmiCalculate e : loader) {
            if (e.getClass().getSimpleName().equals("MetricBmiCalculator")) {
                metric = e.getClass().getAnnotation(NamingAnnotation.class).name();
            } else if (e.getClass().getSimpleName().equals("ImperialBmiCalculator")) {
                imperial = e.getClass().getAnnotation(NamingAnnotation.class).name();
            }
        }
        System.out.println("Welcome to the Bmi Calculator");
        while(true) {
            System.out.println("Please enter select if you want to use Metric or Imperial units");
            System.out.println("1. "+ imperial+"\n2. " + metric + "\n3. Exit");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if(choice.equals("1")){
                System.out.println("Enter your height in full inches");
                String height = sc.nextLine();
                System.out.println("Enter your weight in full pounds");
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
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Wrong input");
            }
        }


    }

}

