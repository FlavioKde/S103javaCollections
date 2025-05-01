package level1.exercise1.logic;

import level1.exercise1.classData.Month;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;




public class MonthManager {

    private ArrayList<Month> monthList;

    public MonthManager(){
            this.monthList = new ArrayList<>();
            initializeMonths();
            addAgost();
            addDuplicate();
    }

    private void initializeMonths() {

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        for (String name : monthNames) {
            monthList.add(new Month(name));
        }
    }
    private void addAgost(){

            monthList.add(7,new Month("Agost"));

    }
    private void addDuplicate(){

            monthList.add(12,new Month("january"));

    }

    public void printMonths() {
        System.out.println("ArrayList (with possible duplicates):");
        for (Month month : monthList) {
            System.out.println("- " + month);
        }
    }
    public void convertToHashSet() {


        LinkedHashSet<Month> hashSet = new LinkedHashSet<>(monthList);
        System.out.println("\nHashSet of months (no duplicates): ");



        System.out.println("Iterating over HashSet:");
        Iterator<Month> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());

        }
    }


}
