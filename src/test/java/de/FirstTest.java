package de;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void FirstTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.idealo.de/");





    }
}
