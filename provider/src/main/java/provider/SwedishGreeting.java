package provider;

import service.Greeting;

public class SwedishGreeting implements Greeting {

    @Override
    public String greet(String name) {
        return "Hej " + name;
    }
}
