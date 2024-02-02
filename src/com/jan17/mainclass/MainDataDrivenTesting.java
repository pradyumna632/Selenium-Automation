package com.jan17.mainclass;

import com.jan17.allmethods.DataDrivenTesting;

import java.io.IOException;

public class MainDataDrivenTesting {
    public static void main(String[] args) throws IOException {
        DataDrivenTesting ddt  =new DataDrivenTesting();
        ddt.readEntireSheet();
    }
}
