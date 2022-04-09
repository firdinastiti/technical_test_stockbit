package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver drive = null;
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    
		System.out.println("inside landing page");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sigma\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		drive = new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.navigate().to("https://stockbit.com/");
	}

	@When("User click menu login")
	public void user_click_menu_login() {
	    
		System.out.println("inside login page");
		drive.findElement(By.className("login-ldn")).click();
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() {
		
		drive.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("firdinastiti");
		drive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@Dea12345");
	}

	@And("User click  login button")
	public void user_click_login_button() {

		
		//drive.findElement(By.className("loginbar")).click();
		drive.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

	@Then("User is on homepage")
	public void user_is_on_homepage() {
		
		drive.findElement(By.className("popavatar")).isDisplayed();
		
		drive.close();
		drive.quit();
		
	}

}
