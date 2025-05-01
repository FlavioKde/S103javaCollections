package level3.exercise1.mainManager;


import level3.exercise1.logic.ManagementPerson;
import level3.exercise1.logic.MenuApp;

public class MainPerson {
    public static void main(String[] args) {


        ManagementPerson managementPerson = new ManagementPerson();
        MenuApp menuApp = new MenuApp(managementPerson);
        menuApp.menu();



    }
}