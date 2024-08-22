package APIPracticeDemo12;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethodDemo12 {
	private JsonPath jsonPath;
	private Response response ;
	private final String baseURL = "https://reqres.in/api/users/2";
	 
	@Given("the user with ID  exist in the system")
	public void the_user_with_id_exist_in_the_system() {
	    
	}

	@When("I send a GET request to {string}")
	public void i_send_a_get_request_to(String string) {
	     response = RestAssured.given()
	     			  .baseUri(baseURL)
	     			   .when()
	     			   .get(baseURL);
	     
		
	}

	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
	     Assert.assertEquals("Expected status code doesnot match",(int)int1, response.getStatusCode());
	     System.out.println(int1);
	}
	
	@Then("the response should contain user details for ID should be {int}")
	public void the_response_should_contain_user_details_for_id_should_be(Integer int2) {
		 response.jsonPath();
        int id = jsonPath.getInt("id");
        System.out.println("The id from the response is: " + id);
	    
	System.out.println(response.then().log().all());
//		System.out.println("The resopnse ID is : " +(response.body().jsonPath().equals(int2)));
		
	}
	
//
//	@Then("the response should contain user details for ID {string}")
//	public void the_response_should_contain_user_details_for_id(String string) {
//	    Assert.assertTrue("Response doesnot contain thre expected user Id",response.getBody().jsonPath().equals(string));
//	}

//	@Then("the response body should include the user name, email, and date of birth")
//	public void the_response_body_should_include_the_user_name_email_and_date_of_birth() {
//	    
////		Assert.assertNotNull(response.getBody().jsonPath().getString("name"));
//		Assert.assertNotNull(response.getBody().jsonPath().getString("email"));
//		 
//		
//	}
// 
}
