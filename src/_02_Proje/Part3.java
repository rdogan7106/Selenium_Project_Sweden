package _02_Proje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Part3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        LoginClass.SauceLogin("standart_user");

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
