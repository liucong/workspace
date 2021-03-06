package org.apache.cxf.jms_greeter;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.1
 * Mon May 04 21:27:00 CST 2009
 * Generated source version: 2.2.1
 * 
 */
 
@WebService(targetNamespace = "http://cxf.apache.org/jms_greeter", name = "JMSGreeterPortType")
@XmlSeeAlso({org.apache.cxf.jms_greeter.types.ObjectFactory.class})
public interface JMSGreeterPortType {

    @ResponseWrapper(localName = "testDataHandlerResponse", targetNamespace = "http://cxf.apache.org/jms_greeter/types", className = "org.apache.cxf.jms_greeter.types.DataHandlerType")
    @RequestWrapper(localName = "testDataHandler", targetNamespace = "http://cxf.apache.org/jms_greeter/types", className = "org.apache.cxf.jms_greeter.types.DataHandlerType")
    @WebMethod
    public void testDataHandler(
        @WebParam(mode = WebParam.Mode.INOUT, name = "name", targetNamespace = "http://cxf.apache.org/jms_greeter/types")
        javax.xml.ws.Holder<java.lang.String> name,
        @WebParam(mode = WebParam.Mode.INOUT, name = "attachinfo", targetNamespace = "http://cxf.apache.org/jms_greeter/types")
        javax.xml.ws.Holder<javax.activation.DataHandler> attachinfo
    );
}
