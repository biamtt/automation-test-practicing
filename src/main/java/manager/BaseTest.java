package manager;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;


    static void setup() {
        driver = WebDriverManager.chromedriver().create();
    }

    @AfterEach
    void teardown() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver(){
        if(driver == null){
            setup();
        }
        return driver;
    }
}
