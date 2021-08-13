package _01_Proje;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.id("userName"));
        userName.sendKeys("Automation");
        Thread.sleep(1000);

        WebElement eMail = driver.findElement(By.id("userEmail"));
        eMail.sendKeys("Testing");
        Thread.sleep(1000);


        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");
        Thread.sleep(1000);


        WebElement parmenentAddress = driver.findElement(By.id("permanentAddress"));
        parmenentAddress.sendKeys("Testing Current Address");
        Thread.sleep(1000);

        WebElement sbmtBtn = driver.findElement(By.id("submit"));
        sbmtBtn.click();
        Thread.sleep(1000);


        driver.quit();

    }
}
