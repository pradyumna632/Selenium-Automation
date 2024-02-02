package com.jan17.mainclass;

import com.jan17.allmethods.ReadExcelApachePOI;

import java.io.IOException;

public class ReadMainApachePOI {
    public static void main(String[] args) throws IOException {

    // Create the object of ExcelApachePOI to access the data members, functions
        ReadExcelApachePOI poi = new ReadExcelApachePOI();
//        poi.readsingleRow();
        poi.readEntireSheet();


    }
}
