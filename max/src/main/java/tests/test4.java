package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//select[@id='userSelect']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//option[text() = 'Harry Potter']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button[@class = 'btn btn-default']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button[@ng-click = 'deposit()']")).click();
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//input[@type='number']")).sendKeys("3223322323233223");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button[@type='submit']")).click();

    }
}
