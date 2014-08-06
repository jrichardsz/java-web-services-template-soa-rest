
package org.rnasystems.soaservice.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.rnasystems.soaservice.structure.model.Evento;

@XmlRootElement(name = "getEventoResponse", namespace = "http://endpoint.soaservice.rnasystems.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventoResponse", namespace = "http://endpoint.soaservice.rnasystems.org/")
public class GetEventoResponse {

    @XmlElement(name = "wsResponse", namespace = "")
    private Evento wsResponse;

    /**
     * 
     * @return
     *     returns Evento
     */
    public Evento getWsResponse() {
        return this.wsResponse;
    }

    /**
     * 
     * @param wsResponse
     *     the value for the wsResponse property
     */
    public void setWsResponse(Evento wsResponse) {
        this.wsResponse = wsResponse;
    }

}
