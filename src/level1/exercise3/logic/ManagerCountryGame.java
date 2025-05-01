package level1.exercise3.logic;

import level1.exercise3.dataClass.RandomCountry;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ManagerCountryGame {

    private  RandomCountry randomCountry;

    public ManagerCountryGame(RandomCountry randomCountry){
        this.randomCountry = randomCountry;
    }



    public void question(){

        HashMap<String, String> countryMap = randomCountry.getCountries().getCountries();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name please?");
        String name = scanner.nextLine().trim();


        int total = 0;

        for(int i = 10; i > 0; i--){

            String country = randomCountry.getRandomCountry();

            System.out.println("What's de Capital of " + country + " ?");
            String capital = scanner.nextLine().trim();

            if (capital.equalsIgnoreCase(countryMap.get(country))) {
                System.out.println("Correct! The capital of " + country + " is indeed " + capital + ".");

                total+=1;
            } else {
                System.out.println("wrong answer, the correct answer is: " + countryMap.get(country));
            }

        }
        System.out.println("The participant " + name + " has obtained " + total + " points");
        printToTxt(name,total);
        scanner.close();
    }
    public void printToTxt(String name, int total){

        try (FileWriter writer = new FileWriter("src/level1/exercise3/txt/clasification.txt",true)) {
            writer.write("Participant: "+name + " " +"Points: "+ Integer.toString(total) + "\n");

        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

    }


}
