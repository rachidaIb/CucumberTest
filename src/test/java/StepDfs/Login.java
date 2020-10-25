package StepDfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;
    @Given("user is on the facebook Login page")
    public void userIsOnTheFacebookLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.get("https://www.facebook.com/");
        Assert.assertTrue(driver.getTitle().contains("fcebook") );


    }

    @And("user logs with username, password")
    public void userLogsWithUsernamePassword() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rachida.ibeghouchene@gmail.com");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rachi1234");
         driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    @Then("user should see message error")
    public void userShouldSeeMessageError() {
    }
}
