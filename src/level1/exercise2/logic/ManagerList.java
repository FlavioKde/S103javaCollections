package level1.exercise2.logic;

import level1.exercise2.dataClass.ListInteger;

public class ManagerList {
    private ListInteger listInteger;

    public ManagerList(ListInteger listInteger){
        this.listInteger = listInteger;
    }
    public void showListNumber(){
        System.out.println("Original List:");
        System.out.println(listInteger.getListNumber());
    }
    public void showListNumberTwo(){
        System.out.println("Reversing List:");
        System.out.println(listInteger.getListNumberTwo());
    }
}
