
package com.heroku.demo.dto.categories;

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
    "id",
    "name",
    "page_description",
    "page_keywords",
    "page_title",
    "parent_category_id",
    "c_enableCompare",
    "c_showInMenu",
    "image",
    "c_slotBannerImage"
})
public class Category_ {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("page_description")
    private String pageDescription;
    @JsonProperty("page_keywords")
    private String pageKeywords;
    @JsonProperty("page_title")
    private String pageTitle;
    @JsonProperty("parent_category_id")
    private String parentCategoryId;
    @JsonProperty("c_enableCompare")
    private boolean cEnableCompare;
    @JsonProperty("c_showInMenu")
    private boolean cShowInMenu;
    @JsonProperty("image")
    private String image;
    @JsonProperty("c_slotBannerImage")
    private String cSlotBannerImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category_() {
    }

    /**
     * 
     * @param cEnableCompare
     * @param id
     * @param cSlotBannerImage
     * @param pageKeywords
     * @param pageTitle
     * @param cShowInMenu
     * @param parentCategoryId
     * @param name
     * @param image
     * @param type
     * @param pageDescription
     */
    public Category_(String type, String id, String name, String pageDescription, String pageKeywords, String pageTitle, String parentCategoryId, boolean cEnableCompare, boolean cShowInMenu, String image, String cSlotBannerImage) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.pageDescription = pageDescription;
        this.pageKeywords = pageKeywords;
        this.pageTitle = pageTitle;
        this.parentCategoryId = parentCategoryId;
        this.cEnableCompare = cEnableCompare;
        this.cShowInMenu = cShowInMenu;
        this.image = image;
        this.cSlotBannerImage = cSlotBannerImage;
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

    public Category_ withType(String type) {
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

    public Category_ withId(String id) {
        this.id = id;
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

    public Category_ withName(String name) {
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

    public Category_ withPageDescription(String pageDescription) {
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

    public Category_ withPageKeywords(String pageKeywords) {
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

    public Category_ withPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The parentCategoryId
     */
    @JsonProperty("parent_category_id")
    public String getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * 
     * @param parentCategoryId
     *     The parent_category_id
     */
    @JsonProperty("parent_category_id")
    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Category_ withParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
        return this;
    }

    /**
     * 
     * @return
     *     The cEnableCompare
     */
    @JsonProperty("c_enableCompare")
    public boolean isCEnableCompare() {
        return cEnableCompare;
    }

    /**
     * 
     * @param cEnableCompare
     *     The c_enableCompare
     */
    @JsonProperty("c_enableCompare")
    public void setCEnableCompare(boolean cEnableCompare) {
        this.cEnableCompare = cEnableCompare;
    }

    public Category_ withCEnableCompare(boolean cEnableCompare) {
        this.cEnableCompare = cEnableCompare;
        return this;
    }

    /**
     * 
     * @return
     *     The cShowInMenu
     */
    @JsonProperty("c_showInMenu")
    public boolean isCShowInMenu() {
        return cShowInMenu;
    }

    /**
     * 
     * @param cShowInMenu
     *     The c_showInMenu
     */
    @JsonProperty("c_showInMenu")
    public void setCShowInMenu(boolean cShowInMenu) {
        this.cShowInMenu = cShowInMenu;
    }

    public Category_ withCShowInMenu(boolean cShowInMenu) {
        this.cShowInMenu = cShowInMenu;
        return this;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Category_ withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * @return
     *     The cSlotBannerImage
     */
    @JsonProperty("c_slotBannerImage")
    public String getCSlotBannerImage() {
        return cSlotBannerImage;
    }

    /**
     * 
     * @param cSlotBannerImage
     *     The c_slotBannerImage
     */
    @JsonProperty("c_slotBannerImage")
    public void setCSlotBannerImage(String cSlotBannerImage) {
        this.cSlotBannerImage = cSlotBannerImage;
    }

    public Category_ withCSlotBannerImage(String cSlotBannerImage) {
        this.cSlotBannerImage = cSlotBannerImage;
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

    public Category_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(id).append(name).append(pageDescription).append(pageKeywords).append(pageTitle).append(parentCategoryId).append(cEnableCompare).append(cShowInMenu).append(image).append(cSlotBannerImage).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category_) == false) {
            return false;
        }
        Category_ rhs = ((Category_) other);
        return new EqualsBuilder().append(type, rhs.type).append(id, rhs.id).append(name, rhs.name).append(pageDescription, rhs.pageDescription).append(pageKeywords, rhs.pageKeywords).append(pageTitle, rhs.pageTitle).append(parentCategoryId, rhs.parentCategoryId).append(cEnableCompare, rhs.cEnableCompare).append(cShowInMenu, rhs.cShowInMenu).append(image, rhs.image).append(cSlotBannerImage, rhs.cSlotBannerImage).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
