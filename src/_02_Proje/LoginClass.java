package _02_Proje;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginClass extends BaseStaticDriver {
    public static void SauceLogin(String username){

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.clear();
        userNameInput.sendKeys(username);
        Wait(1);

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("secret_sauce");
        Wait(1);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

    }
}
