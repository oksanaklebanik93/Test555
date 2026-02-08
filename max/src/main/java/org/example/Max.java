package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Max {
    public static void main (String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://school-kviki.mata-platform.com/unit-list/index");
        driver.findElement(By.xpath(".//input[@id='loginform-identity']")).sendKeys("0979139977");
        driver.findElement(By.xpath(".//input[@id='loginform-password']")).sendKeys("0979139977");
        driver.findElement(By.xpath(".//button [@class='btn btn-info btn-lg btn-block btn-rounded text-uppercase waves-effect waves-light']")).click();

    }
}