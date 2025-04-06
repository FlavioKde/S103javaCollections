package nivel1.exercise1.mainManager;

import nivel1.exercise1.logic.MonthManager;

public class Main {

    public static void main(String[] args) {

        MonthManager monthManager = new MonthManager();

    /*

        HashSet<Month> hashSet = new HashSet<>(monthList);

        System.out.println("HashSet " + hashSet);

        Iterator<Month> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            Month itMonth = iterator.next();
            System.out.println("List of month with Iterator " + itMonth);
        }




     */
        monthManager.printMonths();
        monthManager.convertToHashSet();


    }



}
