package com.jan30;

public class MainGmailTray {
    public static void main(String[] args) {
        GmailTray mail = new GmailTray();
        mail.login("https://www.google.com/");
        mail.mailAccess();
    }
}
