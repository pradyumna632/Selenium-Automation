package com.jan10.mainclass;

import com.jan10.allmethods.WebTablesUsers;

public class MainUsers {
    public static void main(String[] args) {
        WebTablesUsers table = new WebTablesUsers();
        table.login();
        table.handleWebTables();
        table.quitAll();

    }

}
