package level3.exercise1.logic;

import level3.exercise1.classData.Person;

import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public static void writePersonToCSV(String fileName, Person person) {


        try (FileWriter writer = new FileWriter("src/level3/exercise1/csv/person.csv", true)) {

            writer.append(person.getName());
            writer.append(",");
            writer.append(person.getLastName());
            writer.append(",");
            writer.append(person.getID());
            writer.append("\n");
            System.out.println(" "+"Name"+"-----"+"LastName"+"-----"+"ID");
            System.out.printf(" %-10s %-10s %-10s\n", person.getName(), person.getLastName(), person.getID());

        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
