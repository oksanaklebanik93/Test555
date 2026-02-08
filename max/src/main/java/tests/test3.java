package tests;

import org.example.PageObgect;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        PageObgect object = new PageObgect(driver);
        object.Openapp();
        object.pause();
        object.CustomerLogin();
        object.pause();
        object.Name();
        object.pause();
        object.Punkt();
        object.pause();
        object.login();
        object.pause();
        object.deposit();
        object.pause();
        object.type("hiiuhiuhuhihuhiuhuihuihiuhui");
        object.pause();
        object.depositbaton();
}
}
