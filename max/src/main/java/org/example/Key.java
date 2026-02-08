package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://ek.ua/ua/");
        driver.findElement(By.xpath(".//input[@id='ek-search']")).sendKeys("ноутбук");
        driver.findElement(By.xpath(".//button[@name='search_but_']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//span[text() = 'Фото']")).click();
    }
}
