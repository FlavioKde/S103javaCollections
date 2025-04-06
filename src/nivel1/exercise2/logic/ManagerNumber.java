package nivel1.exercise2.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ManagerNumber {
    private List<Integer>listNumber;
    private List<Integer>listNumberTwo;

    public ManagerNumber(){
        this.listNumber = new ArrayList<>();
        this.listNumberTwo = new ArrayList<>();
        initializedNumber();
        initializedNumberTwo();

    }

    public void initializedNumber(){
        Integer[] theNumbers = {
                1, 2, 3, 4, 5, 6, 7, 8
        };
        for (Integer i : theNumbers){
            listNumber.add(i);
        }
    }
    public void showListNumber(){
        System.out.println(listNumber);
    }

    public void initializedNumberTwo(){
        Integer[] theNumbersTwo = {

        };
    }

    public void createListIterator(){
        ListIterator<Integer>listIterator = listNumber.listIterator(listNumber.size());

        System.out.println("Go back...");
        while(listIterator.hasPrevious()){
            Integer number = listIterator.previous();
            listNumberTwo.add(number);




        }
    }
    public void showListNumberTwo(){
        System.out.println(listNumberTwo);
    }
}
