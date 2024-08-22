package APIPracticeDemo12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
 

public class LoginSteps12 {

	ChromeDriver driver = null;
	 
		
		@Given("Browser is open")
		public void browser_is_open() {
			
			System.out.println("Inside Step - Browser is open ");
			String ProjectPath = System.getProperty("user.dir");
			System.out.println("Project Path is : " + ProjectPath);
		    
			System.getProperty("Webdriver.chrome.driver",ProjectPath + "C:\\Program Files\\APIPractice18\\src\\test\\resources\\drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			  
			  
		
		}

		@And("user is on Login Page")
		public void user_is_on_login_page() {
		     System.out.println(" user_is_on_login_page");
		     driver.navigate().to("https://www.demo.guru99.com/v4/");
		}

		@When("User enter the Login Credenctials")
		public void user_enter_the_login_credenctials() {
			
			   System.out.println(" user_enter_the_login_credenctials");
			  
		}

		@And("Hit Login")
		public void hit_login() {
			   System.out.println("Hit Login");
		     
		}

		@Then("User is navigate HomePage")
		public void user_is_navigate_home_page() {
			   System.out.println("User is navigate HomePage");
		    
		}


	

}
