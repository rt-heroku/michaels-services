
package com.heroku.demo.dto.productsearch;

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
    "hit_count",
    "label",
    "value"
})
public class Value {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("hit_count")
    private long hitCount;
    @JsonProperty("label")
    private String label;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Value() {
    }

    /**
     * 
     * @param hitCount
     * @param value
     * @param label
     * @param type
     */
    public Value(String type, long hitCount, String label, String value) {
        this.type = type;
        this.hitCount = hitCount;
        this.label = label;
        this.value = value;
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

    public Value withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The hitCount
     */
    @JsonProperty("hit_count")
    public long getHitCount() {
        return hitCount;
    }

    /**
     * 
     * @param hitCount
     *     The hit_count
     */
    @JsonProperty("hit_count")
    public void setHitCount(long hitCount) {
        this.hitCount = hitCount;
    }

    public Value withHitCount(long hitCount) {
        this.hitCount = hitCount;
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

    public Value withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Value withValue(String value) {
        this.value = value;
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

    public Value withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(hitCount).append(label).append(value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(type, rhs.type).append(hitCount, rhs.hitCount).append(label, rhs.label).append(value, rhs.value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
