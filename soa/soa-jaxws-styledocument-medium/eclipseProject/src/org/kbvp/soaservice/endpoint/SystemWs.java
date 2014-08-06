package org.kbvp.soaservice.endpoint;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class SystemWs {

  public String sayHello(String name) {
    if (name == null) {
      return "Hello";
    }

    return "Hello, " + name + "!";
  }
}