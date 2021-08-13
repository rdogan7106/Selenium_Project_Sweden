package _01_Proje;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Part3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com");
        driver.manage().window().maximize();

        WebElement searchInput  = driver.findElement(By.id("inputValEnter"));
        searchInput.sendKeys("teddy bear");
        Thread.sleep(1000);

        WebElement allowBtn = driver.findElement(By.id("pushAllow"));
        allowBtn.click();
        Thread.sleep(1000);

        WebElement searchBtn  =  driver.findElement(By.className("searchformButton"));
        searchBtn.click();
        Thread.sleep(1000);


        WebElement reslt =  driver.findElement(By.className("nnn"));
        Assert.assertTrue(reslt.getText().contains("We've got"));
        Thread.sleep(1000);


        WebElement logoSnapDeal = driver.findElement(By.className("notIeLogoHeader"));
        logoSnapDeal.click();
        Thread.sleep(1000);


        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.snapdeal.com/"));
        Thread.sleep(1000);

        driver.quit();


    }
}
