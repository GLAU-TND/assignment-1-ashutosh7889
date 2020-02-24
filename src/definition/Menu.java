package definition;

import person.Person;

import java.util.Scanner;

public class Menu {
    private MyLinkedList<Person> linkedList;
    private Scanner scan;

    public Menu() {
        scan = new Scanner(System.in);
        linkedList = new MyLinkedList<>();
    }

    public int showChoice() {
        System.out.println("Welcome to DBC's Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        return scan.nextInt();
    }
}

