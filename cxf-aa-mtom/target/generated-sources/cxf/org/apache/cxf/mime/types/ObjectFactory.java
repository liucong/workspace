
package org.apache.cxf.mime.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.cxf.mime.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestByteArray_QNAME = new QName("http://cxf.apache.org/mime/types", "testByteArray");
    private final static QName _TestByteArrayResponse_QNAME = new QName("http://cxf.apache.org/mime/types", "testByteArrayResponse");
    private final static QName _TestDataHandler_QNAME = new QName("http://cxf.apache.org/mime/types", "testDataHandler");
    private final static QName _TestDataHandlerResponse_QNAME = new QName("http://cxf.apache.org/mime/types", "testDataHandlerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.cxf.mime.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ByteArrayType }
     * 
     */
    public ByteArrayType createByteArrayType() {
        return new ByteArrayType();
    }

    /**
     * Create an instance of {@link DataHandlerType }
     * 
     */
    public DataHandlerType createDataHandlerType() {
        return new DataHandlerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByteArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/mime/types", name = "testByteArray")
    public JAXBElement<ByteArrayType> createTestByteArray(ByteArrayType value) {
        return new JAXBElement<ByteArrayType>(_TestByteArray_QNAME, ByteArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByteArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/mime/types", name = "testByteArrayResponse")
    public JAXBElement<ByteArrayType> createTestByteArrayResponse(ByteArrayType value) {
        return new JAXBElement<ByteArrayType>(_TestByteArrayResponse_QNAME, ByteArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataHandlerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/mime/types", name = "testDataHandler")
    public JAXBElement<DataHandlerType> createTestDataHandler(DataHandlerType value) {
        return new JAXBElement<DataHandlerType>(_TestDataHandler_QNAME, DataHandlerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataHandlerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/mime/types", name = "testDataHandlerResponse")
    public JAXBElement<DataHandlerType> createTestDataHandlerResponse(DataHandlerType value) {
        return new JAXBElement<DataHandlerType>(_TestDataHandlerResponse_QNAME, DataHandlerType.class, null, value);
    }

}
