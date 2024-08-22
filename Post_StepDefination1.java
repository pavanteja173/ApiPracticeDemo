package APIPracticeDemo12;

import org.json.simple.JSONObject;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Post_StepDefination1 {
	RequestSpecification req ;
	Response res;
	ValidatableResponse validate;
	
	@Given("Enter the details  #to write any data we use given")
	public void enter_the_details_to_write_any_data_we_use_given() {
	    
		JSONObject js = new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "leader");
		
		
		  req = RestAssured.given();
		  req.body(js);
		  req.contentType(ContentType.JSON);
		  System.out.println(req.body(js));
		
	}

	@When("To use the link {string}  #where action need to perform we use when")
	public void to_use_the_link_where_action_need_to_perform_we_use_when(String url) {
	     
		  res = req.post(url);
		  
	     
	}

	@Then("To check the status code {int}  #To check the validation")
	public void to_check_the_status_code_to_check_the_validation(Integer int1) {
	    
		  validate = res.then();
		  validate.assertThat().statusCode(int1);
		  System.out.println(res.then().log().all());
		
	}


}
