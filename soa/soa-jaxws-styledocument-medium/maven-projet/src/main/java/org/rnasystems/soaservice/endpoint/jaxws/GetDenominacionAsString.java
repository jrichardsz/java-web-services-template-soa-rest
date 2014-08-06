
package org.rnasystems.soaservice.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getDenominacionAsString", namespace = "http://endpoint.soaservice.rnasystems.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDenominacionAsString", namespace = "http://endpoint.soaservice.rnasystems.org/")
public class GetDenominacionAsString {

    @XmlElement(name = "arg0", namespace = "")
    private String arg0;

    /**
     * 
     * @return
     *     returns String
     */
    public String getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

}
