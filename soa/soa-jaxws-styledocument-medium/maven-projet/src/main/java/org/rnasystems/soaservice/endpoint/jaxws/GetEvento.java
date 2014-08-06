
package org.rnasystems.soaservice.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getEvento", namespace = "http://endpoint.soaservice.rnasystems.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEvento", namespace = "http://endpoint.soaservice.rnasystems.org/")
public class GetEvento {

    @XmlElement(name = "wsRequest", namespace = "")
    private String wsRequest;

    /**
     * 
     * @return
     *     returns String
     */
    public String getWsRequest() {
        return this.wsRequest;
    }

    /**
     * 
     * @param wsRequest
     *     the value for the wsRequest property
     */
    public void setWsRequest(String wsRequest) {
        this.wsRequest = wsRequest;
    }

}
