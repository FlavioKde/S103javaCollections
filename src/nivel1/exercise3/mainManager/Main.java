package nivel1.exercise3.mainManager;

import nivel1.exercise3.logic.ManagerCountries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagerCountries managerCountries = new ManagerCountries("src/nivel1/exercise3/txt/countries.txt");

        managerCountries.question();



    }
}
