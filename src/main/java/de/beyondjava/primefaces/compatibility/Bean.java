package de.beyondjava.primefaces.compatibility;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean
public class Bean {
    private String firstName = "Wayne";

    private String lastName;

    private List<Person> muchedumbre = new ArrayList<>();

    public Bean() {
        muchedumbre.add(new Person("Anna", "Konda"));
        muchedumbre.add(new Person("Wayne", "Interessierts"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Person> getMuchedumbre() {
        return muchedumbre;
    }
}