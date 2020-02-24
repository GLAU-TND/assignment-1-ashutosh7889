package execution;

import definition.Menu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        boolean flag = true;
        Menu menu = new Menu();
        while (flag) {
            int n = menu.showChoice();
            switch (n) {
                case 1:
                    menu.addChoice();
                    break;
            }

        }
    }
