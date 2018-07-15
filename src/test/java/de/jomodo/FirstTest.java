package de.jomodo;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    @Test
    public void myFirstTest() {
       .setProperty("webdriver.chrome.driver", "C:\Program Files/ chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jomodo.de/");
    }







}


