package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ccc {
    public static void main (String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=D969CC6FF1DB38FCF5F8B70DD0924555");
        driver.findElement(By.xpath(".//li[@class='Solutions']")).click();
        driver.findElement(By.xpath(".//a[text()='About Us']")).click();
        driver.findElement(By.xpath(".//a[text()='Services']")).click();
        driver.findElement(By.xpath(".//a[text()='Admin Page']")).click();
        driver.findElement(By.xpath(".//a[text()='Register']")).click();
        driver.findElement(By.xpath(".//input[@id='customer.firstName']")).sendKeys("max");
        driver.findElement(By.xpath(".//input[@id='customer.lastName']")).sendKeys("max2");
        driver.findElement(By.xpath(".//input[@id='customer.address.street']")).sendKeys("ypa");
        driver.findElement(By.xpath(".//input[@id='customer.address.city']")).sendKeys("Lviv");
        driver.findElement(By.xpath(".//input[@id='customer.address.state']")).sendKeys("man");
        driver.findElement(By.xpath(".//input[@id='customer.address.zipCode']")).sendKeys("123456");
        driver.findElement(By.xpath(".//input[@id='customer.phoneNumber']")).sendKeys("380931118355");
        driver.findElement(By.xpath(".//input[@id='customer.ssn']")).sendKeys("238947");
        driver.findElement(By.xpath(".//input[@id='customer.username']")).sendKeys("Max");
        driver.findElement(By.xpath(".//input[@id='customer.password']")).sendKeys("1234567");
        driver.findElement(By.xpath(".//input[@id='repeatedPassword']")).sendKeys("1234567");
        driver.findElement(By.xpath(".//input[@value='Register']")).click();
}
        }