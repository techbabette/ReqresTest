package com.reqres.api.tests;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Users {

    @Test
    public void getAllUsersTest(){
        Playwright playWrightInstance = Playwright.create();
        APIRequest request = playWrightInstance.request();

        APIRequestContext requestContext = request.newContext();

        APIResponse requestResponse = requestContext.get("https://reqres.in/api/users");

        int status = requestResponse.status();

        System.out.println("Hello I am here, the status code is " + status);

        Assert.assertEquals(status, 200);
    }
}
