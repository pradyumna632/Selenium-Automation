package com.jan03.AccessMethods;

import com.jan03.Methods.Meth;

public class AccessMeth extends Meth{
    public static void main(String[] args) {

        // creating or initialization of object of Meth class
        // Meth object = new Meth();

        // Inheriting the Meth class by extending it into AccessMeth class
        // Creating the object of AccessMeth class to access the Super class(Meth) Methods()
        AccessMeth object = new AccessMeth();

        // calling the BrowserSetting() Method
        object.browserSetting("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
    }
}
