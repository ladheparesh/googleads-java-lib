// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201605;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Team} defines a grouping of users and what entities they have access
 *             to. Users are added to teams with {@link UserTeamAssociation} objects.
 *           
 * 
 * <p>Java class for Team complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Team">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasAllCompanies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasAllInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="teamAccessType" type="{https://www.google.com/apis/ads/publisher/v201605}TeamAccessType" minOccurs="0"/>
 *         &lt;element name="companyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adUnitIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Team", propOrder = {
    "id",
    "name",
    "description",
    "hasAllCompanies",
    "hasAllInventory",
    "teamAccessType",
    "companyIds",
    "adUnitIds",
    "orderIds"
})
public class Team {

    protected Long id;
    protected String name;
    protected String description;
    protected Boolean hasAllCompanies;
    protected Boolean hasAllInventory;
    @XmlSchemaType(name = "string")
    protected TeamAccessType teamAccessType;
    @XmlElement(type = Long.class)
    protected List<Long> companyIds;
    protected List<String> adUnitIds;
    @XmlElement(type = Long.class)
    protected List<Long> orderIds;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the hasAllCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAllCompanies() {
        return hasAllCompanies;
    }

    /**
     * Sets the value of the hasAllCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAllCompanies(Boolean value) {
        this.hasAllCompanies = value;
    }

    /**
     * Gets the value of the hasAllInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAllInventory() {
        return hasAllInventory;
    }

    /**
     * Sets the value of the hasAllInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAllInventory(Boolean value) {
        this.hasAllInventory = value;
    }

    /**
     * Gets the value of the teamAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamAccessType }
     *     
     */
    public TeamAccessType getTeamAccessType() {
        return teamAccessType;
    }

    /**
     * Sets the value of the teamAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamAccessType }
     *     
     */
    public void setTeamAccessType(TeamAccessType value) {
        this.teamAccessType = value;
    }

    /**
     * Gets the value of the companyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCompanyIds() {
        if (companyIds == null) {
            companyIds = new ArrayList<Long>();
        }
        return this.companyIds;
    }

    /**
     * Gets the value of the adUnitIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adUnitIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdUnitIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdUnitIds() {
        if (adUnitIds == null) {
            adUnitIds = new ArrayList<String>();
        }
        return this.adUnitIds;
    }

    /**
     * Gets the value of the orderIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getOrderIds() {
        if (orderIds == null) {
            orderIds = new ArrayList<Long>();
        }
        return this.orderIds;
    }

}
