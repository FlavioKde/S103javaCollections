package nivel3.exercise1.logic;


import nivel3.exercise1.exceptions.ExceptionIDPerson;
import nivel3.exercise1.classData.Person;
import nivel3.exercise1.exceptions.ExceptionNomPersonIncorrect;



import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagementPerson {
    private Person person;


    public ManagementPerson() {
        requestInitialData();
    }

    public Person getPerson() {
        return person;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            scanner.nextLine();
        } else {
            System.out.println("No initial entry found. Please check.");
            return;
        }


        boolean exit = false;

        do {
            System.out.println("----CSVPerson Manager----");
            System.out.println("-------------------------");
            System.out.println("---------Options---------");
            System.out.println("1-Enter personal data");
            System.out.println("2-Show the people ordered by name (A-Z).");
            System.out.println("3-Show the people ordered by name (Z-A).");
            System.out.println("4-Show the people ordered by last name (A-Z).");
            System.out.println("5-Show the people ordered by last name (Z-A).");
            System.out.println("6-Show the people ordered by ID (A-Z).");
            System.out.println("7-Show the people ordered by ID (Z-A).");
            System.out.println("0-Exit");
            System.out.println("-------------------------");

            System.out.println("Selection one option");
            int numberSelected = scanner.nextInt();
            scanner.nextLine();


            switch (numberSelected) {
                case 1: {
                    try {
                        Person person = introducePerson(scanner);
                        CsvWriter.writePersonToCSV("src/nivel3/exercise1/csv/person.csv", person);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2, 3, 4, 5, 6, 7: {
                    showSortedPeople(numberSelected);
                    break;
                }
                case 0: {
                    System.out.println("Leaving......");
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Invalid option. Try again.");
                    break;
                }
            }


        } while (!exit);

        scanner.close();
    }

    public void requestInitialData() {

        System.out.println("Hey, how are you?");

    }

    public Person introducePerson(Scanner scanner) throws ExceptionNomPersonIncorrect, ExceptionIDPerson {

        System.out.println("Please give me the name:");
        String name = scanner.nextLine().trim();

        if (!name.matches("[a-zA-Z]+")) {
            throw new ExceptionNomPersonIncorrect("Incorrect name! Only alphabetical characters are allowed. Try again.");
        }


        System.out.println("Please tell me the last name:");
        String lastName = scanner.nextLine().trim();

        if (!lastName.matches("[a-zA-Z]+")) {
            throw new ExceptionNomPersonIncorrect("Incorrect last name! Only alphabetical characters are allowed. Try again.");
        }


        System.out.println("Please tell me the ID:");
        String ID = scanner.nextLine().trim();

        if (!ID.matches("[a-zA-Z0-9-]+")) {
            throw new ExceptionIDPerson("Incorrect ID! Only alphanumeric characters and hyphens are allowed. Try again.");
        }


        return new Person(name, lastName, ID);

    }


    public void showSortedPeople(int mode) {
        List<Person> people = CsvReader.readPersonFromCsv("src/nivel3/exercise1/csv/person.csv");

        if (people.isEmpty()) {
            System.out.println("No people found.");
            return;
        }

        Comparator<Person> comparator = switch (mode) {
            case 2 -> Comparator.comparing(Person::getName); // A-Z name
            case 3 -> Comparator.comparing(Person::getName).reversed(); // Z-A name
            case 4 -> Comparator.comparing(Person::getLastName); // A-Z lastName
            case 5 -> Comparator.comparing(Person::getLastName).reversed(); // Z-A lastName
            case 6 -> Comparator.comparing(Person::getID); // A-Z ID
            case 7 -> Comparator.comparing(Person::getID).reversed(); // Z-A ID
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
}


