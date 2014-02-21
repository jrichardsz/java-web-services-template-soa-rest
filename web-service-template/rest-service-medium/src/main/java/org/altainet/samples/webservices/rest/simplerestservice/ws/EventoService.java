package org.altainet.samples.webservices.rest.simplerestservice.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.altainet.test.model.Evento;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


@Path("/eventoService")
public class EventoService {

	@GET
	@Path("/getDefault")
	@Produces(MediaType.APPLICATION_JSON)
	public Evento getDefaultEvent() {
 
		PodamFactory factory = new PodamFactoryImpl();
		Evento myPojo = factory.manufacturePojo(Evento.class);
		return myPojo;
 
	}
	
	@GET
	@Path("/getEventById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Evento getEventById(@PathParam("id") String id) {

		PodamFactory factory = new PodamFactoryImpl();
		Evento myPojo = factory.manufacturePojo(Evento.class);
		myPojo.setId(id);
		return myPojo;
 
	}
	
	@GET
	@Path("/getEventByUri")
	@Produces(MediaType.APPLICATION_JSON)	
	public Evento getEventByUri(@QueryParam("uri") String uri) {
		
		PodamFactory factory = new PodamFactoryImpl();
		Evento myPojo = factory.manufacturePojo(Evento.class);
		myPojo.setId(uri);
		return myPojo;
 
	}	
	
	
	

} 