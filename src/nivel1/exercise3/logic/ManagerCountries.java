package nivel1.exercise3.logic;

import java.io.FileWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManagerCountries {
    private HashMap<String, String> countries;


    public ManagerCountries(String fileName) {
        this.countries = new HashMap<>();
        loadCountries(fileName);
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

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " Capital: " + entry.getValue());
        }



    }
    public String getRandomCountry() {
        if (countries.isEmpty()) {
            throw new IllegalStateException("No countries available. Check if the file is loaded correctly.");
        }

        List<String> countryKeys = new ArrayList<>(countries.keySet());

        Random random = new Random();
        int randomIndex = random.nextInt(countryKeys.size());

        return countryKeys.get(randomIndex);
    }

    public void question(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name please?");
        String name = scanner.nextLine().trim();


        int total = 0;

        for(int i = 10; i > 0; i--){

            String randomCountry = getRandomCountry();

            System.out.println("What's de Capital of " + randomCountry + " ?");
            String capital = scanner.nextLine().trim();

            if (capital.equalsIgnoreCase(countries.get(randomCountry))) {
                System.out.println("Correct! The capital of " + randomCountry + " is indeed " + capital + ".");

                total+=1;
            } else {
                System.out.println("wrong answer, the correct answer is: " + countries.get(randomCountry));
            }

        }
        System.out.println("The participant " + name + " has obtained " + total + " points");
        printToTxt(name,total);
        scanner.close();
    }
    public void printToTxt(String name, int total){

        try (FileWriter writer = new FileWriter("src/nivel1/exercise3/txt/clasification.txt",true)) {
            writer.write("Participant: "+name + " " +"Points: "+ Integer.toString(total) + "\n");
          //  writer.flush();
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

    }


}




