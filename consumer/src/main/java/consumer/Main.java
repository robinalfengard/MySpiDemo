package consumer;
import service.BmiCalculate;
import service.NamingAnnotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<BmiCalculate> loader = ServiceLoader.load(BmiCalculate.class);
        List<BmiCalculate> bmiCalculateList = new ArrayList<>();

        for (BmiCalculate bmiCalculate : loader) {
            bmiCalculateList.add(bmiCalculate);
        }

        System.out.println("Welcome to the Bmi Calculator");
        while(true){
            int menuOption = 1;
            for(BmiCalculate bmi : bmiCalculateList){
                System.out.println(menuOption + ": " + bmi.getClass().getAnnotation(NamingAnnotation.class).name());
                menuOption +=1;
            }

            System.out.println(menuOption + ": Exit");
            Scanner sc = new Scanner(System.in);
            String menuChoice = sc.nextLine();
            try{
                int parsedMenuChoice = Integer.parseInt(menuChoice);
                if(parsedMenuChoice == bmiCalculateList.size()+1)
                    break;
                if(parsedMenuChoice> bmiCalculateList.size()+1 || parsedMenuChoice < 0)
                    System.out.println("Invalid Selection");
                else
                    System.out.println(bmiCalculateList.get(Integer.parseInt(menuChoice)-1).getResult());
            } catch (NumberFormatException e){
                System.out.println("Invalid Selection");
            }
        }
    }

}

