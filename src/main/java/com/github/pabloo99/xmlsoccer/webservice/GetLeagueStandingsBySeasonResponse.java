
package com.github.pabloo99.xmlsoccer.webservice;

import com.github.pabloo99.xmlsoccer.model.xml.GetLeagueStandingsBySeasonResultXML;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getLeagueStandingsBySeasonResult"
})
@XmlRootElement(name = "GetLeagueStandingsBySeasonResponse")
public class GetLeagueStandingsBySeasonResponse {

    @XmlElement(name = "GetLeagueStandingsBySeasonResult")
    protected GetLeagueStandingsBySeasonResponse.GetLeagueStandingsBySeasonResult getLeagueStandingsBySeasonResult;

    /**
     * Gets the value of the getLeagueStandingsBySeasonResult property.
     *
     * @return
     *     possible object is
     *     {@link GetLeagueStandingsBySeasonResponse.GetLeagueStandingsBySeasonResult }
     *
     */
    public GetLeagueStandingsBySeasonResponse.GetLeagueStandingsBySeasonResult getGetLeagueStandingsBySeasonResult() {
        return getLeagueStandingsBySeasonResult;
    }

    /**
     * Sets the value of the getLeagueStandingsBySeasonResult property.
     *
     * @param value
     *     allowed object is
     *     {@link GetLeagueStandingsBySeasonResponse.GetLeagueStandingsBySeasonResult }
     *
     */
    public void setGetLeagueStandingsBySeasonResult(GetLeagueStandingsBySeasonResponse.GetLeagueStandingsBySeasonResult value) {
        this.getLeagueStandingsBySeasonResult = value;
    }

    //@XmlRootElement(name = "TeamLeagueStanding")
    //@XmlSeeAlso(GetLeagueStandingsBySeasonResultXML.class)
    public static class GetLeagueStandingsBySeasonResult {

        //@XmlMixed
        //@XmlAnyElement(lax = true)
        //@XmlElement(name = "content")
        @XmlElementRef(name="XMLSOCCER.COM", type=GetLeagueStandingsBySeasonResultXML.class)
        protected GetLeagueStandingsBySeasonResultXML content;

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
         * {@link String }
         * {@link Object }
         *
         *
         */
        public GetLeagueStandingsBySeasonResultXML getContent() {
            if (content == null) {
                content = new GetLeagueStandingsBySeasonResultXML();
            }
            return this.content;
        }

    }

}
