package api;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SortingHatApi {
    private static final String SORT_HAT_API = "https://www.potterapi.com/v1/sortinghat";

    public Response getHogwartsHouse(){
        return given().get(SORT_HAT_API);
    }
}
