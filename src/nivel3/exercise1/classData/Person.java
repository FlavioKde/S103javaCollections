package nivel3.exercise1.classData;

import nivel3.exercise1.logic.ManagementPerson;


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
                "Name   | Last Name   | ID\n%s    | %s         | %s",
                name, lastName, ID
        );
    }
}

