package com.iamszabo.jaxws.rpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarEndpoint {

   @WebMethod
   String horn(String honk);
}
