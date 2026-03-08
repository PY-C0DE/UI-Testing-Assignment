package test;

//Importing Selenium libraries required for Testing
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Path for webdriver
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		//Object for Webdriver
        WebDriver driver = new ChromeDriver();

		//Opening Gmail Website
        driver.get("https://mail.google.com");

		//Finding the input field to enter the email
        driver.findElement(By.id("identifierId")).sendKeys("testemail@gmail.com");

        Thread.sleep(2000);

		//Locate the next button
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(3000);

		//Close the browser
        driver.quit();
    }

}

