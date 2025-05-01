package level1.exercise2.dataClass;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {
    private List<Integer> listNumber;
    private List<Integer>listNumberTwo;

    public ListInteger(){
        this.listNumber = new ArrayList<>();
        this.listNumberTwo = new ArrayList<>();
        initializedNumber();

    }

    public List<Integer> getListNumber() {
        return listNumber;
    }

    public List<Integer> getListNumberTwo() {
        return listNumberTwo;
    }

    public void initializedNumber() {
        Integer[] theNumbers = {
                1, 2, 3, 4, 5, 6, 7, 8
        };
        for (Integer integer : theNumbers) {
            listNumber.add(integer);
        }
    }

}
