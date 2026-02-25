package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "D:/Bkp/chromedriver-win64/New folder");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        /*driver.findElement(By.id("inputUsername")).sendKeys("Shambhavi");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacad");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath(("//input[@placeholder=\"Name\"]"))).sendKeys("Shambhavi");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com");
        //driver.findElement(By.xpath(("//input[@placeholder=\"Email\"]"))).sendKeys("shambhavi.pandey");
        //driver.findElement(By.xpath(("//input[@placeholder=\"Email\"]"))).clear();
        //driver.findElement(By.xpath(("//input[@placeholder=\"Phone Number\"]"))).sendKeys("123456078");
        //driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        //driver.findElement(By.xpath(("//input[@placeholder=\"Phone Number\"]"))).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
        //driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        //driver.findElement(By.className("reset-pwd-btn")).click();
        //System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        //driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
        Thread.sleep(1000);
        driver.findElement(By.className("go-to-login-btn")).click();
        //driver.findElement(By.xpath("button[@class='go-to-login-btn'])")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        String name = "rahul";
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.className("logout-btn")).click(); */
        Locators lc = new Locators();
    }

    public void getPassword(WebDriver driver) {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("button[@class=reset-pwd-btn]")).click();
        String passwordText = driver.findElement(By.className("infoMsg")).getText();


    }

}
