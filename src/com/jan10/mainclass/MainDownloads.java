package com.jan10.mainclass;

import com.jan10.allmethods.WebTablesDownloads;

public class MainDownloads {
    public static void main(String[] args) {

        WebTablesDownloads tables = new WebTablesDownloads();
        tables.login();
//        tables.getHead();
        tables.UsefulLinksTab();
    }
}
