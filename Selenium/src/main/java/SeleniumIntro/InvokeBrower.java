package SeleniumIntro;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class InvokeBrower  {

    public static void main(String[] args) {

        //Invoking Browser
        //Selenium manager will open chrome brower
        //ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver1 = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\shambhavi.pandey\\chromedriver-win64"); //without selenium manager


        //With selenium manager

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();


    }

}
