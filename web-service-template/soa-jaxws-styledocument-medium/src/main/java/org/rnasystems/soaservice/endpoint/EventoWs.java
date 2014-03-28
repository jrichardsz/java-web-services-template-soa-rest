package org.rnasystems.soaservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.rnasystems.soaservice.structure.model.Evento;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface EventoWs {

	@WebMethod
	public String getDenominacionAsString(String id);

	@WebMethod
	@WebResult(name = "wsResponse")
	public Evento getEvento(@WebParam(name = "wsRequest")String id);
}