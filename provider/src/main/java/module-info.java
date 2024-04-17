import provider.EnglishGreeting;
import service.Greeting;

module provider {
    requires service;
    provides service.Greeting with provider.SwedishGreeting, provider.EnglishGreeting;

}