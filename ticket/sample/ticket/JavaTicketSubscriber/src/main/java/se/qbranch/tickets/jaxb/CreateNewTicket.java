//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.04 at 03:24:36 PM CET 
//


package se.qbranch.tickets.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ticket_guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticket_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classification_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="application_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticket_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="info">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="solved_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="closed_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="estimated_start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="estimated_complete_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="estimated_time_in_seconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="user_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="user_first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="user_last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="business">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="impact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ticketGuid",
    "ticketDescription",
    "classificationId",
    "applicationId",
    "ticketStatus",
    "contact",
    "info",
    "notes",
    "business"
})
@XmlRootElement(name = "create_new_ticket")
public class CreateNewTicket {

    @XmlElement(name = "customer_id")
    protected int customerId;
    @XmlElement(name = "ticket_guid", required = true, nillable = true)
    protected String ticketGuid;
    @XmlElement(name = "ticket_description", required = true)
    protected String ticketDescription;
    @XmlElement(name = "classification_id", required = true)
    protected String classificationId;
    @XmlElement(name = "application_id", required = true, nillable = true)
    protected String applicationId;
    @XmlElement(name = "ticket_status", required = true)
    protected String ticketStatus;
    @XmlElement(required = true, nillable = true)
    protected CreateNewTicket.Contact contact;
    @XmlElement(required = true, nillable = true)
    protected CreateNewTicket.Info info;
    @XmlElement(required = true, nillable = true)
    protected CreateNewTicket.Notes notes;
    @XmlElement(required = true, nillable = true)
    protected CreateNewTicket.Business business;

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
     * Gets the value of the ticketGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketGuid() {
        return ticketGuid;
    }

    /**
     * Sets the value of the ticketGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketGuid(String value) {
        this.ticketGuid = value;
    }

    /**
     * Gets the value of the ticketDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDescription() {
        return ticketDescription;
    }

    /**
     * Sets the value of the ticketDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDescription(String value) {
        this.ticketDescription = value;
    }

    /**
     * Gets the value of the classificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationId() {
        return classificationId;
    }

    /**
     * Sets the value of the classificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationId(String value) {
        this.classificationId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link CreateNewTicket.Contact }
     *     
     */
    public CreateNewTicket.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNewTicket.Contact }
     *     
     */
    public void setContact(CreateNewTicket.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link CreateNewTicket.Info }
     *     
     */
    public CreateNewTicket.Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNewTicket.Info }
     *     
     */
    public void setInfo(CreateNewTicket.Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link CreateNewTicket.Notes }
     *     
     */
    public CreateNewTicket.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNewTicket.Notes }
     *     
     */
    public void setNotes(CreateNewTicket.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link CreateNewTicket.Business }
     *     
     */
    public CreateNewTicket.Business getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateNewTicket.Business }
     *     
     */
    public void setBusiness(CreateNewTicket.Business value) {
        this.business = value;
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
     *         &lt;element name="impact" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "impact",
        "priority",
        "severity"
    })
    public static class Business {

        @XmlElement(required = true, nillable = true)
        protected String impact;
        @XmlElement(required = true, nillable = true)
        protected String priority;
        @XmlElement(required = true, nillable = true)
        protected String severity;

        /**
         * Gets the value of the impact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpact() {
            return impact;
        }

        /**
         * Sets the value of the impact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpact(String value) {
            this.impact = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriority(String value) {
            this.priority = value;
        }

        /**
         * Gets the value of the severity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeverity() {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeverity(String value) {
            this.severity = value;
        }

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
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "email",
        "name",
        "firstName",
        "lastName",
        "language"
    })
    public static class Contact {

        @XmlElement(required = true)
        protected String email;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(name = "first_name", required = true, nillable = true)
        protected String firstName;
        @XmlElement(name = "last_name", required = true, nillable = true)
        protected String lastName;
        @XmlElement(required = true, nillable = true)
        protected String language;

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

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
     *         &lt;element name="created_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="modified_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="solved_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="closed_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="estimated_start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="estimated_complete_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="estimated_time_in_seconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "createdDate",
        "modifiedDate",
        "solvedDate",
        "closedDate",
        "estimatedStartDate",
        "estimatedCompleteDate",
        "estimatedTimeInSeconds"
    })
    public static class Info {

        @XmlElement(name = "created_date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;
        @XmlElement(name = "modified_date", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modifiedDate;
        @XmlElement(name = "solved_date", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar solvedDate;
        @XmlElement(name = "closed_date", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar closedDate;
        @XmlElement(name = "estimated_start_date", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar estimatedStartDate;
        @XmlElement(name = "estimated_complete_date", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar estimatedCompleteDate;
        @XmlElement(name = "estimated_time_in_seconds", required = true, type = Integer.class, nillable = true)
        protected Integer estimatedTimeInSeconds;

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the modifiedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModifiedDate() {
            return modifiedDate;
        }

        /**
         * Sets the value of the modifiedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModifiedDate(XMLGregorianCalendar value) {
            this.modifiedDate = value;
        }

        /**
         * Gets the value of the solvedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSolvedDate() {
            return solvedDate;
        }

        /**
         * Sets the value of the solvedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSolvedDate(XMLGregorianCalendar value) {
            this.solvedDate = value;
        }

        /**
         * Gets the value of the closedDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getClosedDate() {
            return closedDate;
        }

        /**
         * Sets the value of the closedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setClosedDate(XMLGregorianCalendar value) {
            this.closedDate = value;
        }

        /**
         * Gets the value of the estimatedStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEstimatedStartDate() {
            return estimatedStartDate;
        }

        /**
         * Sets the value of the estimatedStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEstimatedStartDate(XMLGregorianCalendar value) {
            this.estimatedStartDate = value;
        }

        /**
         * Gets the value of the estimatedCompleteDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEstimatedCompleteDate() {
            return estimatedCompleteDate;
        }

        /**
         * Sets the value of the estimatedCompleteDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEstimatedCompleteDate(XMLGregorianCalendar value) {
            this.estimatedCompleteDate = value;
        }

        /**
         * Gets the value of the estimatedTimeInSeconds property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getEstimatedTimeInSeconds() {
            return estimatedTimeInSeconds;
        }

        /**
         * Sets the value of the estimatedTimeInSeconds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setEstimatedTimeInSeconds(Integer value) {
            this.estimatedTimeInSeconds = value;
        }

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
     *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
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
        "note"
    })
    public static class Notes {

        @XmlElement(nillable = true)
        protected List<CreateNewTicket.Notes.Note> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateNewTicket.Notes.Note }
         * 
         * 
         */
        public List<CreateNewTicket.Notes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<CreateNewTicket.Notes.Note>();
            }
            return this.note;
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

}