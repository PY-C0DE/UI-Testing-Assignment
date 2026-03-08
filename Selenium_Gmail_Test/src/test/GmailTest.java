package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com");

        driver.findElement(By.id("identifierId")).sendKeys("testemail@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(3000);

        driver.quit();
    }

}
