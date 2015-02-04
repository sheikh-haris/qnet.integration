//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.04 at 03:24:36 PM CET 
//


package se.qbranch.tickets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ticket_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerId",
    "ticketId",
    "note"
})
@XmlRootElement(name = "add_note_to_ticket")
public class AddNoteToTicket {

    @XmlElement(name = "customer_id")
    protected int customerId;
    @XmlElement(name = "ticket_id", required = true)
    protected String ticketId;
    @XmlElement(required = true)
    protected AddNoteToTicket.Note note;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the ticketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link AddNoteToTicket.Note }
     *     
     */
    public AddNoteToTicket.Note getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddNoteToTicket.Note }
     *     
     */
    public void setNote(AddNoteToTicket.Note value) {
        this.note = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text",
        "userEmail",
        "userName",
        "userFirstName",
        "userLastName"
    })
    public static class Note {

        @XmlElement(required = true)
        protected String text;
        @XmlElement(name = "user_email", required = true)
        protected String userEmail;
        @XmlElement(name = "user_name", required = true)
        protected String userName;
        @XmlElement(name = "user_first_name", required = true, nillable = true)
        protected String userFirstName;
        @XmlElement(name = "user_last_name", required = true, nillable = true)
        protected String userLastName;

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the userEmail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserEmail() {
            return userEmail;
        }

        /**
         * Sets the value of the userEmail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserEmail(String value) {
            this.userEmail = value;
        }

        /**
         * Gets the value of the userName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Sets the value of the userName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Gets the value of the userFirstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFirstName() {
            return userFirstName;
        }

        /**
         * Sets the value of the userFirstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFirstName(String value) {
            this.userFirstName = value;
        }

        /**
         * Gets the value of the userLastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserLastName() {
            return userLastName;
        }

        /**
         * Sets the value of the userLastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserLastName(String value) {
            this.userLastName = value;
        }

    }

}
