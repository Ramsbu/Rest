package com.sample.automation.Impls;

import com.sample.automation.ApiServices;
import com.sample.automation.RestEndpoints;

import static io.restassured.RestAssured.given;

public class ApiServicesImpl implements ApiServices {


    public String getHost() {
        return given().log().all().get(String.format(RestEndpoints.POSTMAN_URL,"asasasas"))
                .then().log().all()
                .statusCode(200)
                .extract().response()
                .jsonPath().getString("headers.host");
    }

}
