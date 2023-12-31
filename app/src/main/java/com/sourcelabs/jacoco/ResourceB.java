package com.sourcelabs.jacoco;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/use-b")
public class ResourceB {

    @Inject
    protected ServiceB serviceB;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String useB() {
        return serviceB.onlyTestedThroughSIT();
    }
}
