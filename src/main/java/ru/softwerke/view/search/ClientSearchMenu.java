package ru.softwerke.view.search;

import ru.softwerke.controller.search.ClientSearchController;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

public class ClientSearchMenu implements Returner {

    public void showClientSearchMenu() {
        ReadWriter.printLine("Client search menu: \n" +
            "1. Search by id \n" +
            "2. Search by name \n" +
            "3. Search by surname \n" +
            "4. Search by birthday \n" +
            "5. Go back");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                searchId();
                break;
            case "2":
                searchName();
                break;
            case "3":
                searchSurname();
                break;
            case "4":
                searchBirthDay();
                break;
            case "5":
                returnToInitMenu();
                break;
                default:
                    wrongEntry();
                    break;
        }
    }

    private void searchId() {
        ReadWriter.printLine("Enter clients id you want to find:");
        String id = ReadWriter.readLine();
        new ClientSearchController().searchById(id);
    }

    private void searchName() {
        ReadWriter.printLine("Enter clients name you want to find:");
        String firstName = ReadWriter.readLine();
        new ClientSearchController().searchByName(firstName);
    }

    private void searchSurname() {
        ReadWriter.printLine("Enter clients surname you want to find:");
        String lastName = ReadWriter.readLine();
        new ClientSearchController().searchBySurname(lastName);
    }

    private void searchBirthDay() {
        ReadWriter.printLine("Enter clients birth date you want to find:");
        String localDate = ReadWriter.readLine();
        new ClientSearchController().searchByBDay(localDate);
    }

}
