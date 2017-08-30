package com.sample.automation;

import com.sample.automation.Impls.ApiServicesImpl;
import org.junit.Assert;
import org.junit.Test;

public class RestServicesTest {

    @Test
    public void testPostmanHost() {
        ApiServices apiServices = new ApiServicesImpl();
        String host = apiServices.getHost();
        System.out.println(host);
        Assert.assertEquals(host, "postman-echo.com");
    }
}
