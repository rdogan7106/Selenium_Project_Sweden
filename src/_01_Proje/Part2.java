package _01_Proje;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("techno123.");
        Thread.sleep(1000);


        WebElement loginBtn = driver.findElement(By.id("log-in"));
        loginBtn.click();
        Thread.sleep(1000);


        WebElement text  = driver.findElement(By.id("time"));
        Assert.assertTrue(text.getText().contains("Your nearest branch closes in: 30m 5s"));
        Thread.sleep(1000);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.applitools.com/app.html"));
         Thread.sleep(1000);

        driver.quit();

    }
}
