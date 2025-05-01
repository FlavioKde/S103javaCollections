package level1.exercise3.dataClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Countries {
    private HashMap<String, String> countries;


    public Countries(String fileName) {
        this.countries = new HashMap<>();
        loadCountries(fileName);
    }

    public HashMap<String, String> getCountries() {
        return countries;
    }

    private void loadCountries(String fileName) {
        try
                (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countries.put(country, capital);

                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
}
