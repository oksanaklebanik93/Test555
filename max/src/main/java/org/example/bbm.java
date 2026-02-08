package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbm {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            WebDriverManager.chromedriver().setup();
            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
            PageObgect obgect=new PageObgect(driver);
            try{
                Thread.sleep(6000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            obgect.CustomerLogin();
            try{
                Thread.sleep(6000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            obgect.Name();
            obgect.Punkt();
            obgect.login();
            try{
                Thread.sleep(6000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            obgect.deposit();
            try{
                Thread.sleep(6000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            obgect.type("123");
            obgect.depositbaton();
        }
    }

