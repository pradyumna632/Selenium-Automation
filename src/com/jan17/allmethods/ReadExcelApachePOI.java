package com.jan17.allmethods;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelApachePOI {

    XSSFWorkbook workbook = null;
    XSSFSheet sheet;

    // Create an object of File class to open xlsx file
    File filePath = new File("ReadFiles/ReadExcel.xlsx");

    // Create an object of FileInputStream to read the Excel file
    FileInputStream inputStream;

    //Read the Specific Cell value
    public void readsingleRow() throws IOException {

        inputStream = new FileInputStream(filePath);

        // Create an instance of Workbook to access the workbook
        workbook = new XSSFWorkbook(inputStream);

        // Create an instance of Sheet to access/get the Sheet
        sheet = workbook.getSheet("Sheet1"); // using sheet name
//        sheet = workbook.getSheetAt(0); // using sheet index

        // create an instance of row to access/ get the rowNo 1
        XSSFRow rowNo1 = sheet.getRow(0);

        // create an instance of cell to access/ get the cellNo 1 and 2
        XSSFCell cellNo1 = rowNo1.getCell(0);
        XSSFCell cellNo2 = rowNo1.getCell(1);

        //Store the cell value in a variable
        String heading1 =cellNo1.getStringCellValue();
        String heading2 =cellNo2.getStringCellValue();

        // print the value of cell
        System.out.print(heading1 + "\t");
        System.out.println(heading2);

    }

    // Read the entire Excel sheet
    public void readEntireSheet() throws IOException {

        inputStream = new FileInputStream(filePath);

        // Create an instance of Workbook to access the workbook
        workbook = new XSSFWorkbook(inputStream);

        // Create an instance of Sheet to access/get the Sheet
        sheet = workbook.getSheet("Sheet1"); // using sheet name

        //get the total row count
        int totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
        //get the total cell count in 0th row
        int totalCells = sheet.getRow(0).getLastCellNum();

        //iterate over all the row to print the data present in each cell.
        for (int currentRow = 0; currentRow < totalRows; currentRow++ ){
            for (int currentCell = 0; currentCell < totalCells; currentCell++){

                //iterate over each cell to print its value
                System.out.print(sheet.getRow(currentRow).getCell(currentCell).getStringCellValue());
                System.out.print("\t\t");
            }
            System.out.println();
        }
        workbook.close();
    }

}
