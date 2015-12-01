package com.enedilim.rest.client;

import com.enedilim.rest.model.WordList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WordApi {

    @GET
    @Path("{word}")
    @Produces(MediaType.APPLICATION_XML)
    public WordList getWord(@PathParam("word") String word);
    
}
