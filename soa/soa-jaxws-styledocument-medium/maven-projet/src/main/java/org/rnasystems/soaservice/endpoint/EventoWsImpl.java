package org.rnasystems.soaservice.endpoint;

import javax.jws.WebService;

import org.rnasystems.soaservice.structure.model.Evento;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@WebService(endpointInterface = "org.rnasystems.soaservice.endpoint.EventoWs")
public class EventoWsImpl implements EventoWs {

	public String getDenominacionAsString(String id) {
		PodamFactory factory = new PodamFactoryImpl();
		String myPojo = factory.manufacturePojo(String.class);
		return myPojo;
	}

	public Evento getEvento(String id) {
		PodamFactory factory = new PodamFactoryImpl();
		Evento myPojo = factory.manufacturePojo(Evento.class);
		return myPojo;
	}
}