package consumer;

import service.Greeting;

import java.io.IOException;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws IOException {

        // Letar efter interfacet Greeting
        ServiceLoader<Greeting> loader = ServiceLoader.load(Greeting.class);


        for(Greeting g : loader) {
            System.out.println(g.greet("Robin"));
        }

        System.out.println("Press any key to continue...");
        System.in.read();

        ServiceLoader<Greeting> loader2 = ServiceLoader.load(Greeting.class);


        for(Greeting g : loader2) {
            System.out.println(g.greet("Robin"));
        }

    }

    }

