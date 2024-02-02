package com.jan16.allmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    //Create instance of Properties class
    Properties props;
    //Read Properties File from source folder
    String propPath = "src/com/jan16/Config.properties";

    public ReadPropertiesFile() {

            props = new Properties();
            try {
                FileInputStream fis = new FileInputStream(propPath);
                props.load(fis);
                fis.close();
                }
            catch (IOException e) {
                e.printStackTrace();
            }
    }


    public String getUrl(){
        String url = props.getProperty("url");
        if (url != null) {
            return url;
        }else{
            throw new RuntimeException("Url is Not Specified");
        }
    }

    public String getUserName(){
        String username = props.getProperty("username");
        if (username != null) {
            return username;
        }else{
            throw new RuntimeException("username is Not Specified");
        }
    }

    public String getPassword(){
        String password = props.getProperty("password");
        if (password != null) {
            return password;
        }else{
            throw new RuntimeException("password is Not Specified");
        }
    }


}