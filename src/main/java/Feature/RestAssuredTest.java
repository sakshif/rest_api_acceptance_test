package Feature;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredTest {



	
	@Test
	public void should_return_OK_for_google() {
		
		given().
		when().get("http://www.google.com").
		then().statusCode(200);
		
	}

	
	@Test
	public void should_return_country_name_Afghanistan() {
		
		given().
		when().get("http://services.groupkt.com/country/get/all").
		then().assertThat().
		body("RestResponse.result.name[0]", equalTo("Afghanistan"));
		
	}
	
	@Test
	public void should_post_user_id() {
		
		given().
		contentType("application/json").
    	body("{\"title\":\"foo\"}").
    	and().
    	body("{\"body\":\"bar\"}").
    	and().
    	body("{\"userID\":\"1\"}").
    	when().post("http://jsonplaceholder.typicode.com/posts").
		then().statusCode(201).
		and().
		//extract().response().prettyPrint());
		assertThat().
		body("id", equalTo(101));
		
	}

}
