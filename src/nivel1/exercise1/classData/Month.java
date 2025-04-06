package nivel1.exercise1.classData;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }



    @Override
    public String toString() {
        return "Month " +"\n"+
                "name-> " + name + '\n'
                ;
    }
}
