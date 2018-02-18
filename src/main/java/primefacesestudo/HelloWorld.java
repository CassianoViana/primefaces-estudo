package primefacesestudo;

import lombok.Data;

import javax.faces.bean.ManagedBean;

@ManagedBean
@Data
public class HelloWorld {

    private String firstName = "John";
    private String lastName = "Doe";

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!!!";
    }
}