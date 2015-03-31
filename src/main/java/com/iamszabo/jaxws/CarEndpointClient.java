package com.iamszabo.jaxws;

import com.iamszabo.jaxws.rpc.CarEndpoint;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CarEndpointClient {

   public static void main(String[] args) throws MalformedURLException {
      URL url = new URL("http://localhost:9999/car?wsdl");
      QName qName = new QName("http://rpc.jaxws.iamszabo.com/", "CarEndpointImplService");
      Service service = Service.create(url, qName);
      CarEndpoint port = service.getPort(CarEndpoint.class);
      System.out.println(port.horn("little car"));
   }
}
