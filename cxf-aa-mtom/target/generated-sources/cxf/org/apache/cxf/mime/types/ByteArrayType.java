
package org.apache.cxf.mime.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByteArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByteArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachinfo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByteArrayType", propOrder = {
    "name",
    "attachinfo"
})
public class ByteArrayType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected byte[] attachinfo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attachinfo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachinfo() {
        return attachinfo;
    }

    /**
     * Sets the value of the attachinfo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachinfo(byte[] value) {
        this.attachinfo = ((byte[]) value);
    }

}
