package pl.karnia;

import org.junit.jupiter.api.Test;
import pl.karnia.greetings.Greeter;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    public void itGreetsUser(){
        //Arrange / Given
        String name = "Karol";
        Greeter greeter = new Greeter();
        //Act / When
        String greetingText = greeter.hello(name);
        //Assert / Then
        assertEquals("Hello Karol", greetingText);
        //assertEquals(true,false);
    }
}
