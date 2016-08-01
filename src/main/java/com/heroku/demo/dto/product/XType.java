
package com.heroku.demo.dto.product;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_type",
    "master"
})
public class XType {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("master")
    private boolean master;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public XType() {
    }

    /**
     * 
     * @param type
     * @param master
     */
    public XType(String type, boolean master) {
        this.type = type;
        this.master = master;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The _type
     */
    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    public XType withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The master
     */
    @JsonProperty("master")
    public boolean isMaster() {
        return master;
    }

    /**
     * 
     * @param master
     *     The master
     */
    @JsonProperty("master")
    public void setMaster(boolean master) {
        this.master = master;
    }

    public XType withMaster(boolean master) {
        this.master = master;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public XType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(master).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XType) == false) {
            return false;
        }
        XType rhs = ((XType) other);
        return new EqualsBuilder().append(type, rhs.type).append(master, rhs.master).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
