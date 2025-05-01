package level1.exercise2.dataClass;

import java.util.List;
import java.util.ListIterator;

public class ListIntegerTwo {
    private ListInteger listInteger;

    public  ListIntegerTwo(ListInteger listInteger){
        this.listInteger = listInteger;
    }

    public void createListIterator(){

        List<Integer>listNumber = listInteger.getListNumber();
        List<Integer>listNumberTwo = listInteger.getListNumberTwo();

        ListIterator<Integer> listIterator = listNumber.listIterator(listNumber.size());

        System.out.println("Go back...");

        while(listIterator.hasPrevious()){
            Integer number = listIterator.previous();
            listNumberTwo.add(number);

        }
    }
}
