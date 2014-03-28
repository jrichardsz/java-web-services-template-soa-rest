package org.jrichardsz.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jrichardsz.rest.model.Corporation;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@Path("/corporationService")
public class CorporationService {

	@GET
	@Path("/getDefault")
	@Produces(MediaType.APPLICATION_JSON)
	public Corporation getDefaultEvent() {
 
		PodamFactory factory = new PodamFactoryImpl();
		Corporation myPojo = factory.manufacturePojo(Corporation.class);
		return myPojo;
 
	}
	
	@GET
	@Path("/getEmployeeById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Corporation getEventById(@PathParam("id") String id) {

		PodamFactory factory = new PodamFactoryImpl();
		Corporation myPojo = factory.manufacturePojo(Corporation.class);
		myPojo.setId(id);
		return myPojo;
 
	}
	
	@GET
	@Path("/getEmployeeByUri")
	@Produces(MediaType.APPLICATION_JSON)	
	public Corporation getEventByUri(@QueryParam("uri") String uri) {
		
		PodamFactory factory = new PodamFactoryImpl();
		Corporation myPojo = factory.manufacturePojo(Corporation.class);
		myPojo.setId(uri);
		return myPojo;
 
	}	
	
	
	

} 