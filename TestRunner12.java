package APIPracticeDemo12;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"APIPracticeDemo12"}, 
	
	monochrome = true,
	
	plugin = {"pretty","json:C:\\Program Files\\APIPractice18\\target\\JSONReports\\report.json"},
	
	
	
tags =  "@RetrieveUserDetails"
		
			)
	public class TestRunner12 {

		public static void main(String[] args) {
			 
		}
	 

}
