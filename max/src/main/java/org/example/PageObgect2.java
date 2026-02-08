package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObgect2 {
    private WebDriver driver;

    public PageObgect2(WebDriver driver) {
        this.driver = driver;
    }

    public void Manager() {
        driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
    }
    public void OpenAccount(){
        driver.findElement(By.xpath(".//button[@ng-click='openAccount()']")).click();
    }
    public void CustomerName(){
        driver.findElement(By.xpath(".//select[@id='userSelect']")).click();
    }
    public void Punkt2() {
        driver.findElement(By.xpath(".//option[text() = 'Harry Potter']")).click();
    }
    public void Currency(){
        driver.findElement(By.xpath(".//select[@id='currency']")).click();
    }
    public void Punkt3(){
        driver.findElement(By.xpath(".//option[text() = 'Dollar']")).click();
    }
    public void proces(){
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
    }
}