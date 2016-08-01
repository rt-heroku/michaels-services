
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
    "_v",
    "_type",
    "id",
    "long_description",
    "min_order_quantity",
    "name",
    "page_description",
    "page_keywords",
    "page_title",
    "primary_category_id",
    "short_description",
    "step_quantity",
    "type",
    "c_styleNumber",
    "c_tabDescription",
    "c_tabDetails"
})
public class Product {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("long_description")
    private String longDescription;
    @JsonProperty("min_order_quantity")
    private long minOrderQuantity;
    @JsonProperty("name")
    private String name;
    @JsonProperty("page_description")
    private String pageDescription;
    @JsonProperty("page_keywords")
    private String pageKeywords;
    @JsonProperty("page_title")
    private String pageTitle;
    @JsonProperty("primary_category_id")
    private String primaryCategoryId;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("step_quantity")
    private long stepQuantity;
    @JsonProperty("type")
    private XType xType;
    @JsonProperty("c_styleNumber")
    private String cStyleNumber;
    @JsonProperty("c_tabDescription")
    private String cTabDescription;
    @JsonProperty("c_tabDetails")
    private String cTabDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param xType
     * @param pageKeywords
     * @param type
     * @param stepQuantity
     * @param id
     * @param v
     * @param cTabDetails
     * @param cTabDescription
     * @param shortDescription
     * @param pageTitle
     * @param name
     * @param longDescription
     * @param cStyleNumber
     * @param primaryCategoryId
     * @param minOrderQuantity
     * @param pageDescription
     */
    public Product(String v, String type, String id, String longDescription, long minOrderQuantity, String name, String pageDescription, String pageKeywords, String pageTitle, String primaryCategoryId, String shortDescription, long stepQuantity, XType xType, String cStyleNumber, String cTabDescription, String cTabDetails) {
        this.v = v;
        this.type = type;
        this.id = id;
        this.longDescription = longDescription;
        this.minOrderQuantity = minOrderQuantity;
        this.name = name;
        this.pageDescription = pageDescription;
        this.pageKeywords = pageKeywords;
        this.pageTitle = pageTitle;
        this.primaryCategoryId = primaryCategoryId;
        this.shortDescription = shortDescription;
        this.stepQuantity = stepQuantity;
        this.xType = xType;
        this.cStyleNumber = cStyleNumber;
        this.cTabDescription = cTabDescription;
        this.cTabDetails = cTabDetails;
    }

    /**
     * 
     * @return
     *     The v
     */
    @JsonProperty("_v")
    public String getV() {
        return v;
    }

    /**
     * 
     * @param v
     *     The _v
     */
    @JsonProperty("_v")
    public void setV(String v) {
        this.v = v;
    }

    public Product withV(String v) {
        this.v = v;
        return this;
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

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Product withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The longDescription
     */
    @JsonProperty("long_description")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * 
     * @param longDescription
     *     The long_description
     */
    @JsonProperty("long_description")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Product withLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    /**
     * 
     * @return
     *     The minOrderQuantity
     */
    @JsonProperty("min_order_quantity")
    public long getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * 
     * @param minOrderQuantity
     *     The min_order_quantity
     */
    @JsonProperty("min_order_quantity")
    public void setMinOrderQuantity(long minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public Product withMinOrderQuantity(long minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The pageDescription
     */
    @JsonProperty("page_description")
    public String getPageDescription() {
        return pageDescription;
    }

    /**
     * 
     * @param pageDescription
     *     The page_description
     */
    @JsonProperty("page_description")
    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    public Product withPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
        return this;
    }

    /**
     * 
     * @return
     *     The pageKeywords
     */
    @JsonProperty("page_keywords")
    public String getPageKeywords() {
        return pageKeywords;
    }

    /**
     * 
     * @param pageKeywords
     *     The page_keywords
     */
    @JsonProperty("page_keywords")
    public void setPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords;
    }

    public Product withPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords;
        return this;
    }

    /**
     * 
     * @return
     *     The pageTitle
     */
    @JsonProperty("page_title")
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * 
     * @param pageTitle
     *     The page_title
     */
    @JsonProperty("page_title")
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public Product withPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The primaryCategoryId
     */
    @JsonProperty("primary_category_id")
    public String getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    /**
     * 
     * @param primaryCategoryId
     *     The primary_category_id
     */
    @JsonProperty("primary_category_id")
    public void setPrimaryCategoryId(String primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public Product withPrimaryCategoryId(String primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
        return this;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The short_description
     */
    @JsonProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Product withShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * 
     * @return
     *     The stepQuantity
     */
    @JsonProperty("step_quantity")
    public long getStepQuantity() {
        return stepQuantity;
    }

    /**
     * 
     * @param stepQuantity
     *     The step_quantity
     */
    @JsonProperty("step_quantity")
    public void setStepQuantity(long stepQuantity) {
        this.stepQuantity = stepQuantity;
    }

    public Product withStepQuantity(long stepQuantity) {
        this.stepQuantity = stepQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The xType
     */
    @JsonProperty("type")
    public XType getXType() {
        return xType;
    }

    /**
     * 
     * @param xType
     *     The x_type
     */
    @JsonProperty("type")
    public void setXType(XType xType) {
        this.xType = xType;
    }

    public Product withXType(XType xType) {
        this.xType = xType;
        return this;
    }

    /**
     * 
     * @return
     *     The cStyleNumber
     */
    @JsonProperty("c_styleNumber")
    public String getCStyleNumber() {
        return cStyleNumber;
    }

    /**
     * 
     * @param cStyleNumber
     *     The c_styleNumber
     */
    @JsonProperty("c_styleNumber")
    public void setCStyleNumber(String cStyleNumber) {
        this.cStyleNumber = cStyleNumber;
    }

    public Product withCStyleNumber(String cStyleNumber) {
        this.cStyleNumber = cStyleNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The cTabDescription
     */
    @JsonProperty("c_tabDescription")
    public String getCTabDescription() {
        return cTabDescription;
    }

    /**
     * 
     * @param cTabDescription
     *     The c_tabDescription
     */
    @JsonProperty("c_tabDescription")
    public void setCTabDescription(String cTabDescription) {
        this.cTabDescription = cTabDescription;
    }

    public Product withCTabDescription(String cTabDescription) {
        this.cTabDescription = cTabDescription;
        return this;
    }

    /**
     * 
     * @return
     *     The cTabDetails
     */
    @JsonProperty("c_tabDetails")
    public String getCTabDetails() {
        return cTabDetails;
    }

    /**
     * 
     * @param cTabDetails
     *     The c_tabDetails
     */
    @JsonProperty("c_tabDetails")
    public void setCTabDetails(String cTabDetails) {
        this.cTabDetails = cTabDetails;
    }

    public Product withCTabDetails(String cTabDetails) {
        this.cTabDetails = cTabDetails;
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

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(v).append(type).append(id).append(longDescription).append(minOrderQuantity).append(name).append(pageDescription).append(pageKeywords).append(pageTitle).append(primaryCategoryId).append(shortDescription).append(stepQuantity).append(xType).append(cStyleNumber).append(cTabDescription).append(cTabDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(v, rhs.v).append(type, rhs.type).append(id, rhs.id).append(longDescription, rhs.longDescription).append(minOrderQuantity, rhs.minOrderQuantity).append(name, rhs.name).append(pageDescription, rhs.pageDescription).append(pageKeywords, rhs.pageKeywords).append(pageTitle, rhs.pageTitle).append(primaryCategoryId, rhs.primaryCategoryId).append(shortDescription, rhs.shortDescription).append(stepQuantity, rhs.stepQuantity).append(xType, rhs.xType).append(cStyleNumber, rhs.cStyleNumber).append(cTabDescription, rhs.cTabDescription).append(cTabDetails, rhs.cTabDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
