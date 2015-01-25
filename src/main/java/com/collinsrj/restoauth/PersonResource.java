package com.collinsrj.restoauth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/person")
public class PersonResource {
    @GET
    @Produces("text/plain")
    public String getPerson() {
        return "Person";
    }
}