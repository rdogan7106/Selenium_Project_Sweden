package _02_Proje;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Part2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/");
       WebElement userElement =  driver.findElement(By.xpath("//*[@id='login_credentials']"));
       String strUser =  userElement.getText();
       String[] users = strUser.split("\n");
        System.out.println(strUser);

        for (int i = 1; i < users.length ; i++) {
            LoginClass.SauceLogin(users[i]);
            List<WebElement> btnProduct = driver.findElements(By.xpath("//span[text='Product']"));
            if(btnProduct.size()==1){
                System.out.println("login oldu");
                driver.navigate().back();
            }else {
                System.out.println("login olmadı");
            }
        }
    }


}
