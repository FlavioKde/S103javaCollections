package nivel1.exercise1.logic;

import nivel1.exercise1.classData.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class MonthManager {

    private ArrayList<Month> monthList;

    public MonthManager(){
            this.monthList = new ArrayList<>();
            initializeMonths();
            addAgost();
            addAnotherMonth();
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
        String [] monthNames = {
                "Agost"
        };
        for (String agost : monthNames){
            monthList.add(7,new Month(agost));
        }
    }
    private void addAnotherMonth(){
        String [] monthNames = {
                "January"
        };
        for(String january : monthNames){
            monthList.add(12,new Month(january));
        }
    }

    public void printMonths() {
        System.out.println("List of months:");
        for (Month month : monthList) {
            System.out.println("- " + month);
        }
    }
    public void convertToHashSet() {
        LinkedHashSet<Month> hashSet = new LinkedHashSet<>(monthList);
        System.out.println("\nHashSet of months (no duplicates): " + hashSet);


        Iterator<Month> iterator = hashSet.iterator();
        System.out.println("Iterating over HashSet:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }


}
