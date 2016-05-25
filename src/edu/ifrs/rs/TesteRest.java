package edu.ifrs.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("teste")
public class TesteRest {
	
	@Path("hello")
	@GET
//	@Produces("text/plain")
	@Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	
    	return "Alo mundo! (via GET)";
    }
    
	@Path("nome")
	@POST
//	@Consumes("application/x-www-form-urlencoded")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String printName(@FormParam("user") String name) {
		
//		System.out.println(name);
		return "Alo " + name + "! (via POST)";
	}
}
