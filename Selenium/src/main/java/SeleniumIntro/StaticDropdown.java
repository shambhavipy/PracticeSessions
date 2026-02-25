package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //handle dropdown with select tag

        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");

        //Passengers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click(); //click plus button in 1 time so total adult will be 2.
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        int i=1;

     //   while(i<5) {
           //  driver.findElement(By.id("hrefIncAdt")).click(); //click plus button in 1 time so total adult will be 5.
             i++;
      //   }

        for(i=1; i<5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click(); //click plus button in 1 time so total adult will be 5.

        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
}
