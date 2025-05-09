package level2.exercise1.classData;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name = name;
        this.score = score;

    }

    public String getName() {
        return name;
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



    @Override
    public String toString() {
        return "Restaurant" + "\n"+
                "name= " + name + '\n' +
                "score= " + score +"\n";
    }
}
