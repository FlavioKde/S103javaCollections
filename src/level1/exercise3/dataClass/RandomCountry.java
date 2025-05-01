package level1.exercise3.dataClass;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomCountry {
    private Countries countries;

    public RandomCountry(Countries countries){
        this.countries = countries;
    }

    public Countries getCountries() {
        return countries;
    }

    public String getRandomCountry() {

        var countriMap =  countries.getCountries();

        if (countriMap.isEmpty()) {
            throw new IllegalStateException("No countries available. Check if the file is loaded correctly.");
        }

        List<String> countryKeys = new ArrayList<>(countriMap.keySet());

        Random random = new Random();
        int randomIndex = random.nextInt(countryKeys.size());

        return countryKeys.get(randomIndex);
    }
}
