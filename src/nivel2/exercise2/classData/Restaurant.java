package nivel2.exercise2.classData;

import java.util.*;
import java.util.Comparator;


public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;

    }


    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o ){

        if(this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && name.equals(that.name);

    }
    @Override
    public int hashCode(){
        return Objects.hash(name,score);
    }


    public static List<Restaurant> convertList(HashSet<Restaurant> hashSet)
    {
        return new ArrayList<>(hashSet);

    }
    public static Comparator<Restaurant> descendingComparator() {
        return Comparator.comparingInt(Restaurant::getScore).reversed();


    }


    @Override
    public String toString() {
        return "Restaurant" + "\n"+
                "name= " + name + '\n' +
                "score= " + score +"\n";
    }
}
