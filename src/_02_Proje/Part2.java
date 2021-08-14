package _02_Proje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Part2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login-button']"));
        String[] userNameList  ={"standard_user","locked_out_user","problem_user","performance_glitch_user"};
        for (int i = 0; i < userNameList.length ; i++)  {
            userName.sendKeys(userNameList[i]);
            password.sendKeys("secret_sauce");
            Wait(1);
            loginBtn.click();
            Wait(1);
           try{
               WebElement burgerBtn = driver.findElement(By.id("react-burger-menu-btn"));
               WebElement loginProduct = driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span"));
               Wait(1);
               loginProduct.getText().contains("PRODUCT");
               System.out.println("login successfully");
               burgerBtn.click();
               WebElement logoutBtn = driver.findElement(By.id("logout_sidebar_link"));
               logoutBtn.click();
           }catch (Exception e){
               System.out.println("wrong successfully");
               e.printStackTrace();
               Wait(1);
           }
        }
        Quit();

    }


}
