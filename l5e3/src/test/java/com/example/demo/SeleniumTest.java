package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

@SpringBootTest
public class SeleniumTest {

    @LocalServerPort
    private int port;

    @Test
    public static void main(String[] args) throws InterruptedException {
        //start the driver, open chrome to our target url
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/animal");
        //find the fields we want by id and fill them in
        WebElement inputField = driver.findElement(By.id("animalText"));
        inputField.sendKeys("Manatee");
        inputField = driver.findElement(By.id("adjective"));
        inputField.sendKeys("Whirling");
        //the fields don’t clear on submit for our simple app, so just submit it 5 times
        for (int i = 0; i < 5; i++) {
            inputField.submit();
            List<WebElement> trainingResults = driver.findElements(By.className("trainingMessage"));
            System.out.println("trainingResults.size() = " + trainingResults.size());
        }
        // then get the element by the class conclusionMessage and print it
        WebElement conclusionResult = driver.findElement(By.className("conclusionMessage"));
        System.out.println("conclusionResult.getText() = " + conclusionResult.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}