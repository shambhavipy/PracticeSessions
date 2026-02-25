package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FlipkartDemo {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      /*  driver.get("https://www.flipkart.com/");
        driver.findElement(By.className("iyMZqb")).click();
//      Thread.sleep(2000);
        //driver.findElement(By.xpath("c3Bd2c yXUQVt")).click();
        //driver.findElement(By.xpath("input[@class = 'jmDjbL']")).sendKeys("+91");
        driver.findElement(By.xpath("input[@class = 'c3Bd2c yXUQVt']")).click();
        driver.findElement(By.xpath("input[@class = 'c3Bd2c yXUQVt']")).sendKeys("shrutipandey@gmail.com");
*/
        driver.get("https://www.amazon.in/");
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_email_login")).click();
        driver.findElement(By.className("a-button-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email_login")).sendKeys("Vivek");


//        driver.findElement(By.className("nav-line-2 ")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.partialLinkText("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0")).click();




    }
}



