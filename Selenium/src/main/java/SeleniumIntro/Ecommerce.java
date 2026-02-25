package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Ecommerce {
    public static void additems(WebDriver driver, String[] itemsneeded) {
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedname = name[0].trim();
            //Convert array into arraylist
            List itemneeded = Arrays.asList(itemsneeded);
            if (itemneeded.contains(formattedname)) {
                j++;
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                if(j==itemneeded.toArray().length) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String[] itemsneeded = {"Cucumber", "Brocolli"};
        additems(driver, itemsneeded);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText(), "Code applied ..!" );
        System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
        
    }
}
