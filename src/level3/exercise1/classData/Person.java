package level3.exercise1.classData;

import level3.exercise1.logic.ManagementPerson;

import java.util.List;


public class Person {
    private String name;
    private String lastName;
    private String ID;
    private ManagementPerson managementPerson;


    public Person(String name, String lastName, String ID) {
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;


    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }


    @Override

    public String toString() {
        return String.format(
                "  Name-----Last Name-----ID" +"\n"+
                "%-10s %-10s %-10s",
                name, lastName, ID);

    }
}

