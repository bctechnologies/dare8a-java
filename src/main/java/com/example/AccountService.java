package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/accounts")
public class AccountService {

    // Modify this method to implement the request handling
    // while considering the GET semantics of a RESTful
    // service.
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getBalance(@PathParam("accountNumber") String id) {
        AccountBalance result = new AccountBalance();
        return Response.ok().entity(result).build();
    }

    // Modify this method to implement the request handling
    // while considering the POST semantics of a RESTful
    // service.
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response postAccountBalance(AccountBalance accountBalance) {
        AccountBalance result = new AccountBalance();
        // ... and here
        return Response.ok().entity(result).build();
    }

    // Modify this method to implement the request handling
    // while considering the PUT semantics of a RESTful
    // service.
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/{id}")
    public Response putAccountBalance(AccountBalance accountBalance) {
        AccountBalance result = new AccountBalance();
        // ... and here
        return Response.ok().entity(result).build();
    }

}

