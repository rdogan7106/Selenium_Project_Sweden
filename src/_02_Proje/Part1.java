package _02_Proje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Part1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        LoginClass.SauceLogin("standart_user");
        List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));
        for(WebElement product: productList ){
            System.out.println("product = " + product.getText());

        }
        Wait(1);
        Quit();

    }
}
