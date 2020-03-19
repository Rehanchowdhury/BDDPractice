package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class GoogleStepDefinitaions {

WebDriver driver;

    @Given("I am on  Google home page")
    public void i_am_on_Google_home_page() {
       System.setProperty("webdriver.chrome.driver","/Users/Rehan/Desktop/BDDPractice/driver/chromedriver");
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://www.google.com/");
    }

    @When("i click the search box i should  see the cursor")
    public void i_click_the_search_box_i_should_see_the_cursor() {
     driver.findElement(By.xpath("//input[@name='q']")).click();


    }

    @Then("i will enter the Laptop")
    public void i_will_enter_the_Laptop() {
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
    }

    @Then("I will click the search button")
    public void i_will_click_the_search_button() {
       driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
    }






}
