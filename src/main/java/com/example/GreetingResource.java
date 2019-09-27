package com.example;

import sun.util.resources.LocaleData;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

import static javax.ws.rs.core.Response.ok;

@Path("/greeting")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Path("/{name}")
    Response greeting(@PathParam("name") String name) {
        return ok(this.greetingService.buildGreetingMessage(name)).build();
    }
}
