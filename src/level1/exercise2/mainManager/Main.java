package level1.exercise2.mainManager;

import level1.exercise2.dataClass.ListInteger;
import level1.exercise2.dataClass.ListIntegerTwo;
import level1.exercise2.logic.ManagerList;

public class Main {
    public static void main(String[] args) {

        ListInteger listInteger = new ListInteger();
        ListIntegerTwo listIntegerTwo = new ListIntegerTwo(listInteger);
        ManagerList managerList = new ManagerList(listInteger);

        listIntegerTwo.createListIterator();
        managerList.showListNumber();
        managerList.showListNumberTwo();
    }
}
