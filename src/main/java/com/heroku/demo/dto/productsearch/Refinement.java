
package com.heroku.demo.dto.productsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "attribute_id",
    "label",
    "values"
})
public class Refinement {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("attribute_id")
    private String attributeId;
    @JsonProperty("label")
    private String label;
    @JsonProperty("values")
    private List<Value> values = new ArrayList<Value>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Refinement() {
    }

    /**
     * 
     * @param values
     * @param label
     * @param attributeId
     * @param type
     */
    public Refinement(String type, String attributeId, String label, List<Value> values) {
        this.type = type;
        this.attributeId = attributeId;
        this.label = label;
        this.values = values;
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

    public Refinement withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The attributeId
     */
    @JsonProperty("attribute_id")
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * 
     * @param attributeId
     *     The attribute_id
     */
    @JsonProperty("attribute_id")
    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public Refinement withAttributeId(String attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Refinement withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    /**
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Refinement withValues(List<Value> values) {
        this.values = values;
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

    public Refinement withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(attributeId).append(label).append(values).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Refinement) == false) {
            return false;
        }
        Refinement rhs = ((Refinement) other);
        return new EqualsBuilder().append(type, rhs.type).append(attributeId, rhs.attributeId).append(label, rhs.label).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
