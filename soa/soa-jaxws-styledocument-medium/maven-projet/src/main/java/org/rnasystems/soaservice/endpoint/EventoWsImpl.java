package org.rnasystems.soaservice.endpoint;

import java.util.*;

import javax.jws.*;

import org.rnasystems.soaservice.structure.model.*;

import uk.co.jemos.podam.api.*;

@WebService(endpointInterface = "org.rnasystems.soaservice.endpoint.EventoWs")
public class EventoWsImpl implements EventoWs {

	public String getDenominacionAsString(String id) {
		String simpleResponse = ""+ new Date().getTime();
		return simpleResponse;
	}

	public Evento getEvento(String id) {
		PodamFactory factory = new PodamFactoryImpl();
		Evento myPojo = factory.manufacturePojo(Evento.class);
		return myPojo;
	}
}