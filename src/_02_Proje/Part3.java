package _02_Proje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Part3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        WebElement userName = driver.findElement(By.id("user-name"));
        ((WebElement) userName).sendKeys("standard_user");
        Wait(1);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Wait(1);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        Wait(1);

        List<WebElement> addBtnList = driver.findElements(By.xpath("//div[@class='pricebar']/button"));
        for (int i = 0; i <addBtnList.size() ; i++) {
            addBtnList.get(i).click();
        }
        Wait(2);
        List<WebElement> removeBtnList = driver.findElements(By.xpath("//div[@class='pricebar']/button"));
        for (int i = 0; i <removeBtnList.size() ; i++) {
            removeBtnList.get(i).click();
        }

        WebElement basket =driver.findElement(By.id("shopping_cart_link"));
        Assert.assertTrue(basket.getText().contains(""));
        Quit();





    }
}
