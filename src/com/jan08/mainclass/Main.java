package com.jan08.mainclass;

import com.jan05.framework.Windowhandles;
import com.jan08.framework.CreateSeleniumFramework;

public class Main {

    public static void main(String[] args) {

        CreateSeleniumFramework handle = new CreateSeleniumFramework();

        handle.browserSetting("D:\\Automation Testing JBK Resources\\Testing Softwares\\Offline Website\\index.html");
        handle.login();
    }
}
