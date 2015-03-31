package com.iamszabo.jaxws;

import com.iamszabo.jaxws.wsimport.CarEndpoint;
import com.iamszabo.jaxws.wsimport.CarEndpointImplService;

public class CarEndpointWsImportClient {

   public static void main(String[] args) {
      CarEndpointImplService service = new CarEndpointImplService();
      CarEndpoint endpoint = service.getCarEndpointImplPort();
      System.out.println(endpoint.horn("die die little car"));
   }
}
