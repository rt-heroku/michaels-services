
package com.heroku.demo.dto.categories;

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
    "categories",
    "id",
    "name",
    "page_description",
    "page_title",
    "parent_category_id",
    "c_enableCompare",
    "c_headerMenuBanner",
    "c_headerMenuOrientation",
    "c_showInMenu",
    "page_keywords",
    "c_alternativeUrl"
})
public class Category {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("categories")
    private List<Category_> categories = new ArrayList<Category_>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("page_description")
    private String pageDescription;
    @JsonProperty("page_title")
    private String pageTitle;
    @JsonProperty("parent_category_id")
    private String parentCategoryId;
    @JsonProperty("c_enableCompare")
    private boolean cEnableCompare;
    @JsonProperty("c_headerMenuBanner")
    private String cHeaderMenuBanner;
    @JsonProperty("c_headerMenuOrientation")
    private String cHeaderMenuOrientation;
    @JsonProperty("c_showInMenu")
    private boolean cShowInMenu;
    @JsonProperty("page_keywords")
    private String pageKeywords;
    @JsonProperty("c_alternativeUrl")
    private String cAlternativeUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param cEnableCompare
     * @param id
     * @param cAlternativeUrl
     * @param pageKeywords
     * @param cHeaderMenuOrientation
     * @param pageTitle
     * @param cShowInMenu
     * @param parentCategoryId
     * @param name
     * @param categories
     * @param type
     * @param cHeaderMenuBanner
     * @param pageDescription
     */
    public Category(String type, List<Category_> categories, String id, String name, String pageDescription, String pageTitle, String parentCategoryId, boolean cEnableCompare, String cHeaderMenuBanner, String cHeaderMenuOrientation, boolean cShowInMenu, String pageKeywords, String cAlternativeUrl) {
        this.type = type;
        this.categories = categories;
        this.id = id;
        this.name = name;
        this.pageDescription = pageDescription;
        this.pageTitle = pageTitle;
        this.parentCategoryId = parentCategoryId;
        this.cEnableCompare = cEnableCompare;
        this.cHeaderMenuBanner = cHeaderMenuBanner;
        this.cHeaderMenuOrientation = cHeaderMenuOrientation;
        this.cShowInMenu = cShowInMenu;
        this.pageKeywords = pageKeywords;
        this.cAlternativeUrl = cAlternativeUrl;
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

    public Category withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<Category_> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<Category_> categories) {
        this.categories = categories;
    }

    public Category withCategories(List<Category_> categories) {
        this.categories = categories;
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

    public Category withId(String id) {
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

    public Category withName(String name) {
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

    public Category withPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
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

    public Category withPageTitle(String pageTitle) {
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

    public Category withParentCategoryId(String parentCategoryId) {
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

    public Category withCEnableCompare(boolean cEnableCompare) {
        this.cEnableCompare = cEnableCompare;
        return this;
    }

    /**
     * 
     * @return
     *     The cHeaderMenuBanner
     */
    @JsonProperty("c_headerMenuBanner")
    public String getCHeaderMenuBanner() {
        return cHeaderMenuBanner;
    }

    /**
     * 
     * @param cHeaderMenuBanner
     *     The c_headerMenuBanner
     */
    @JsonProperty("c_headerMenuBanner")
    public void setCHeaderMenuBanner(String cHeaderMenuBanner) {
        this.cHeaderMenuBanner = cHeaderMenuBanner;
    }

    public Category withCHeaderMenuBanner(String cHeaderMenuBanner) {
        this.cHeaderMenuBanner = cHeaderMenuBanner;
        return this;
    }

    /**
     * 
     * @return
     *     The cHeaderMenuOrientation
     */
    @JsonProperty("c_headerMenuOrientation")
    public String getCHeaderMenuOrientation() {
        return cHeaderMenuOrientation;
    }

    /**
     * 
     * @param cHeaderMenuOrientation
     *     The c_headerMenuOrientation
     */
    @JsonProperty("c_headerMenuOrientation")
    public void setCHeaderMenuOrientation(String cHeaderMenuOrientation) {
        this.cHeaderMenuOrientation = cHeaderMenuOrientation;
    }

    public Category withCHeaderMenuOrientation(String cHeaderMenuOrientation) {
        this.cHeaderMenuOrientation = cHeaderMenuOrientation;
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

    public Category withCShowInMenu(boolean cShowInMenu) {
        this.cShowInMenu = cShowInMenu;
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

    public Category withPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords;
        return this;
    }

    /**
     * 
     * @return
     *     The cAlternativeUrl
     */
    @JsonProperty("c_alternativeUrl")
    public String getCAlternativeUrl() {
        return cAlternativeUrl;
    }

    /**
     * 
     * @param cAlternativeUrl
     *     The c_alternativeUrl
     */
    @JsonProperty("c_alternativeUrl")
    public void setCAlternativeUrl(String cAlternativeUrl) {
        this.cAlternativeUrl = cAlternativeUrl;
    }

    public Category withCAlternativeUrl(String cAlternativeUrl) {
        this.cAlternativeUrl = cAlternativeUrl;
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

    public Category withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(categories).append(id).append(name).append(pageDescription).append(pageTitle).append(parentCategoryId).append(cEnableCompare).append(cHeaderMenuBanner).append(cHeaderMenuOrientation).append(cShowInMenu).append(pageKeywords).append(cAlternativeUrl).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Category) == false) {
            return false;
        }
        Category rhs = ((Category) other);
        return new EqualsBuilder().append(type, rhs.type).append(categories, rhs.categories).append(id, rhs.id).append(name, rhs.name).append(pageDescription, rhs.pageDescription).append(pageTitle, rhs.pageTitle).append(parentCategoryId, rhs.parentCategoryId).append(cEnableCompare, rhs.cEnableCompare).append(cHeaderMenuBanner, rhs.cHeaderMenuBanner).append(cHeaderMenuOrientation, rhs.cHeaderMenuOrientation).append(cShowInMenu, rhs.cShowInMenu).append(pageKeywords, rhs.pageKeywords).append(cAlternativeUrl, rhs.cAlternativeUrl).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
