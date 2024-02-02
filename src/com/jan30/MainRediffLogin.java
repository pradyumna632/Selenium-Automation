package com.jan30;

public class MainRediffLogin {
    public static void main(String[] args) {
        RediffLogin rediff = new RediffLogin();
        rediff.login("https://mail.rediff.com/cgi-bin/login.cgi");
        rediff.rediffAccess();
    }
}
