package pl.karnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.karnia.carddatabase.ListCardDatabase;
import pl.karnia.credit.CardApi;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        System.out.println("Hello World");
        SpringApplication.run(App.class, args);
    }

    @Bean
    CardApi createCardApi() {
        return new CardApi(new ListCardDatabase());
    }
}
