package _03_Proje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.*;
import java.util.List;

public class _01_Task1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/");
        Wait(1);
        WebElement clos = driver.findElement(By.id("close-fixedban"));
        clos.click();
        Wait(1);
        WebElement formBtn = driver.findElement(By.xpath("//div[@class='category-cards']/child::div[2]"));
        formBtn.click();
        Wait(1);


        WebElement practiceForms = driver.findElement(By.xpath("(//*[@id='item-0'])[2]"));
        practiceForms.click();
        Wait(1);

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("rrrr");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("dddd");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("exam@gmail.com");

        WebElement cins = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        cins.click();

        WebElement phoneNum = driver.findElement(By.id("userNumber"));
        phoneNum.sendKeys("2324568762");

        WebElement dateofBirth = driver.findElement(By.id("dateOfBirth-wrapper"));
        dateofBirth.click();

        WebElement mountList = driver.findElement(By.className("react-datepicker__month-select"));
        Select mountLis = new Select(mountList);
        mountLis.selectByIndex(6);
        mountLis.getOptions();

        WebElement yearList = driver.findElement(By.className("react-datepicker__year-select"));
        Select yearLis = new Select(yearList);
        yearLis.selectByValue("1990");
        yearLis.getOptions();

        WebElement selectDay = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]"));
        selectDay.click();

        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("message");

        List<WebElement> checkbox= driver.findElements(By.xpath("//label[@class='custom-control-label']"));
        for (int i = 1; i <checkbox.size() ; i++) {
            if(i>3){
                checkbox.get(i).click();
            }

        }
        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("your address");

        WebElement state=driver.findElement(By.id("state"));

        Actions actions = new Actions(driver);
        Action action = actions.click(state).sendKeys(Keys.ENTER).build();
        action.perform();
        Wait(1);

        WebElement city = driver.findElement(By.id("city"));
        Actions actions2 = new Actions(driver);
        Action action2 = actions2.click(city).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
        action2.perform();

        WebElement sbmtBtn = driver.findElement(By.id("submit"));
        sbmtBtn.click();
        Wait(2);

        WebElement closeBtn = driver.findElement(By.id("closeLargeModal"));
        closeBtn.click();
        Quit();

    }
}
