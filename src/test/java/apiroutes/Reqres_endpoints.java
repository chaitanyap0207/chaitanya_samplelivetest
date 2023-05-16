package apiroutes;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import apipayloads.Reqres_POJO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Reqres_endpoints {
	
	
public static Response createuser(Reqres_POJO payload){
		
		Response response= given().contentType(ContentType.JSON).body(payload).when().post(Reqres_routes.post_url);
		
		return response;
	}
	
public static Response getuser(){
		
		Response response= 
				given().contentType(ContentType.JSON).when().get(Reqres_routes.get_url);
		
		return response;
	}
	


public static Response updateuser(String id, Reqres_POJO payload) {
	Response response= given().contentType(ContentType.JSON).body(payload).pathParam("id", id)
			.when().put();
	return response;
}


}
