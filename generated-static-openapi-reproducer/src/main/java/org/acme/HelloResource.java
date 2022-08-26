package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {

    @GET
    String hello() {
        return "hello";
    }
}
