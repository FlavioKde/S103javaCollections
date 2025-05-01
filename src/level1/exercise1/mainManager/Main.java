package level1.exercise1.mainManager;

import level1.exercise1.logic.MonthManager;

public class Main {

    public static void main(String[] args) {

        MonthManager monthManager = new MonthManager();
        monthManager.printMonths();
        monthManager.convertToHashSet();

    }

}
