package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseStaticDriver {
    public static WebDriver driver;
        static {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        public static void Bekle(int saniye){
            try {
                Thread.sleep(saniye*1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public static void kapat(){
            driver.quit();
        }

    }
