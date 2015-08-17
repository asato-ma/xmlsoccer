
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetFixturesResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFixturesByDateIntervalResult"
})
@XmlRootElement(name = "GetFixturesByDateIntervalResponse")
public class GetFixturesByDateIntervalResponse {

    @XmlElement(name = "GetFixturesByDateIntervalResult")
    protected GetFixturesByDateIntervalResponse.GetFixturesByDateIntervalResult getFixturesByDateIntervalResult;

    /**
     * Gets the value of the getFixturesByDateIntervalResult property.
     *
     * @return
     *     possible object is
     *     {@link GetFixturesByDateIntervalResponse.GetFixturesByDateIntervalResult }
     *
     */
    public GetFixturesByDateIntervalResponse.GetFixturesByDateIntervalResult getGetFixturesByDateIntervalResult() {
        return getFixturesByDateIntervalResult;
    }

    /**
     * Sets the value of the getFixturesByDateIntervalResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetFixturesByDateIntervalResponse.GetFixturesByDateIntervalResult }
     *
     */
    public void setGetFixturesByDateIntervalResult(GetFixturesByDateIntervalResponse.GetFixturesByDateIntervalResult value) {
        this.getFixturesByDateIntervalResult = value;
    }

    public static class GetFixturesByDateIntervalResult {

        @XmlElementRef(name="XMLSOCCER.COM", type=GetFixturesResultXML.class)
        protected GetFixturesResultXML content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link String }
         * 
         * 
         */
        public GetFixturesResultXML getContent() {
            if (content == null) {
                content = new GetFixturesResultXML();
            }
            return this.content;
        }

    }

}
