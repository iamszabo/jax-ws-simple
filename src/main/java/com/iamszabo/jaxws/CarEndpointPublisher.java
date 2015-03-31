package com.iamszabo.jaxws;

import com.iamszabo.jaxws.rpc.CarEndpointImpl;

import javax.xml.ws.Endpoint;

public class CarEndpointPublisher {

   public static void main(String[] args) {
      Endpoint.publish("http://localhost:9999/car", new CarEndpointImpl());
   }
}
