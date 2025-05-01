package level1.exercise3.mainManager;

import level1.exercise3.dataClass.Countries;
import level1.exercise3.dataClass.RandomCountry;
import level1.exercise3.logic.ManagerCountryGame;

public class Main {
    public static void main(String[] args) {


        Countries countries = new Countries("src/level1/exercise3/txt/countries.txt");
        RandomCountry randomCountry = new RandomCountry(countries);
        ManagerCountryGame managerCountryGame = new ManagerCountryGame(randomCountry);
        managerCountryGame.question();




    }
}
