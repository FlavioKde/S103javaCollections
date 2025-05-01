package level3.exercise1.logic;

import level3.exercise1.classData.Person;

import java.util.Scanner;

public class MenuApp {
    private ManagementPerson managementPerson;

    public MenuApp(ManagementPerson managementPerson){
        this.managementPerson = managementPerson;
        menu();
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
                        Person person = managementPerson.introducePerson(scanner);
                        CsvWriter.writePersonToCSV("src/level3/exercise1/csv/person.csv", person);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2, 3, 4, 5, 6, 7: {
                    managementPerson.showSortedPeople(numberSelected);
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
}
