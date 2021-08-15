package _02_Proje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Part4 extends BaseStaticDriver {
    public static <productList> void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        LoginClass.SauceLogin("standart_user");

        List<WebElement> addBtnList = driver.findElements(By.xpath("//div[@class='pricebar']/button"));
        for (int i = 0; i <addBtnList.size() ; i++) {
            addBtnList.get(i).click();
        }


       List<WebElement> productList = driver.findElements(By.xpath("//*[@class='inventory_item_label']/a/div"));

        WebElement basketClick = driver.findElement(By.id("shopping_cart_container"));
        basketClick.click();
        List<WebElement> basketList = driver.findElements(By.xpath("//*[@class='cart_item_label']/a/div"));

            for (int i = 0; i < productList.size() ; i++) {
                  for (int j = 0; j < basketList.size() ; j++) {
                        if (productList.get(i).getText().contains(basketList.get(j).getText())){
                             System.out.println("true");
              }

        }
            }
        Quit();
    }
}
