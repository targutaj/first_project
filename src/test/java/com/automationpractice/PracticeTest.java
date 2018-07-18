package com.automationpractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
    @Test
    public void PracticTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();



    }






}
