package com.iamszabo.jaxws.rpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.iamszabo.jaxws.rpc.CarEndpoint")
public class CarEndpointImpl implements CarEndpoint {
   @Override
   public String horn(String honk) {
      return "du-du-du " + honk;
   }
}
