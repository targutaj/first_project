package de.jomodo;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C://Program Files/chrome driver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jomodo.de/");
        }
}


