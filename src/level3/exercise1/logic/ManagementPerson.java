package level3.exercise1.logic;


import level3.exercise1.exceptions.IDPersonException;
import level3.exercise1.classData.Person;
import level3.exercise1.exceptions.NomPersonIncorrectException;



import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagementPerson {
    private Person person;


    public ManagementPerson() {

        requestInitialData();

    }

    public void requestInitialData() {

        System.out.println("Hey, how are you?");

    }

    public Person introducePerson(Scanner scanner) throws NomPersonIncorrectException, IDPersonException {

        System.out.println("Please give me the name:");
        String name = scanner.nextLine().trim();

        if (!name.matches("[a-zA-Z]+")) {
            throw new NomPersonIncorrectException("Incorrect name! Only alphabetical characters are allowed. Try again.");
        }


        System.out.println("Please tell me the last name:");
        String lastName = scanner.nextLine().trim();

        if (!lastName.matches("[a-zA-Z]+")) {
            throw new NomPersonIncorrectException("Incorrect last name! Only alphabetical characters are allowed. Try again.");
        }


        System.out.println("Please tell me the ID:");
        String ID = scanner.nextLine().trim();

        if (!ID.matches("[a-zA-Z0-9-]+")) {
            throw new IDPersonException("Incorrect ID! Only alphanumeric characters and hyphens are allowed. Try again.");
        }


        return new Person(name, lastName, ID);

    }


    public void showSortedPeople(int mode) {
        List<Person> people = CsvReader.readPersonFromCsv("src/level3/exercise1/csv/person.csv");

        if (people.isEmpty()) {
            System.out.println("No people found.");
            return;
        }

        Comparator<Person> comparator = switch (mode) {
            case 2 -> Comparator.comparing(Person::getName);
            case 3 -> Comparator.comparing(Person::getName).reversed();
            case 4 -> Comparator.comparing(Person::getLastName);
            case 5 -> Comparator.comparing(Person::getLastName).reversed();
            case 6 -> Comparator.comparing(Person::getID);
            case 7 -> Comparator.comparing(Person::getID).reversed();
            default -> null;
        };

        if (comparator == null) {
            System.out.println("Invalid sorting option.");
            return;
        }

        people.sort(comparator);

        System.out.println("------ Sorted People ------");
        for (Person person : people) {
            System.out.println(person);
        }
    }
    public void printPeople(List<Person> people) {
        System.out.println("  Name-----Last Name-----ID");

        for (Person person : people) {
            System.out.println(String.format("%-10s %-10s %-10s",
                    person.getName(),
                    person.getLastName(),
                    person.getID()));
        }
    }

}


