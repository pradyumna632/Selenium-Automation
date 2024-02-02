package com.jan17.allmethods;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTesting {


    XSSFWorkbook workbook = null;
    XSSFSheet sheet;

    // Create an object of File class to open xlsx file
    File filePath = new File("ReadFiles/ReadExcel.xlsx");

    // Create an object of FileInputStream to read the Excel file
    FileInputStream inputStream;

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
