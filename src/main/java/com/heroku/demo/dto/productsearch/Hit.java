
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
    "currency",
    "image",
    "link",
    "price",
    "price_max",
    "product_id",
    "product_name",
    "product_type"
})
public class Hit {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("link")
    private String link;
    @JsonProperty("price")
    private long price;
    @JsonProperty("price_max")
    private double priceMax;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_type")
    private ProductType productType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hit() {
    }

    /**
     * 
     * @param price
     * @param link
     * @param priceMax
     * @param image
     * @param type
     * @param productName
     * @param productType
     * @param productId
     * @param currency
     */
    public Hit(String type, String currency, Image image, String link, long price, double priceMax, String productId, String productName, ProductType productType) {
        this.type = type;
        this.currency = currency;
        this.image = image;
        this.link = link;
        this.price = price;
        this.priceMax = priceMax;
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
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

    public Hit withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Hit withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    public Hit withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public Hit withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public long getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(long price) {
        this.price = price;
    }

    public Hit withPrice(long price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The priceMax
     */
    @JsonProperty("price_max")
    public double getPriceMax() {
        return priceMax;
    }

    /**
     * 
     * @param priceMax
     *     The price_max
     */
    @JsonProperty("price_max")
    public void setPriceMax(double priceMax) {
        this.priceMax = priceMax;
    }

    public Hit withPriceMax(double priceMax) {
        this.priceMax = priceMax;
        return this;
    }

    /**
     * 
     * @return
     *     The productId
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Hit withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 
     * @return
     *     The productName
     */
    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    /**
     * 
     * @param productName
     *     The product_name
     */
    @JsonProperty("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Hit withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 
     * @return
     *     The productType
     */
    @JsonProperty("product_type")
    public ProductType getProductType() {
        return productType;
    }

    /**
     * 
     * @param productType
     *     The product_type
     */
    @JsonProperty("product_type")
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Hit withProductType(ProductType productType) {
        this.productType = productType;
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

    public Hit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(currency).append(image).append(link).append(price).append(priceMax).append(productId).append(productName).append(productType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hit) == false) {
            return false;
        }
        Hit rhs = ((Hit) other);
        return new EqualsBuilder().append(type, rhs.type).append(currency, rhs.currency).append(image, rhs.image).append(link, rhs.link).append(price, rhs.price).append(priceMax, rhs.priceMax).append(productId, rhs.productId).append(productName, rhs.productName).append(productType, rhs.productType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
