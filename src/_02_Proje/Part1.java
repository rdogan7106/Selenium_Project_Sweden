package _02_Proje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Part1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Bekle(1);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Bekle(1);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

        List<WebElement> productList = driver.findElements(By.className("inventory_item_name"));
        for(WebElement product: productList ){
            System.out.println("product = " + product.getText());

        }

    }
}
