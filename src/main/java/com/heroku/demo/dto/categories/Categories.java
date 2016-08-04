
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
    "_v",
    "_type",
    "categories",
    "id",
    "name",
    "parent_category_id",
    "c_enableCompare",
    "c_showInMenu",
    "c_showSubCategories"
})
public class Categories {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<Category>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("parent_category_id")
    private String parentCategoryId;
    @JsonProperty("c_enableCompare")
    private boolean cEnableCompare;
    @JsonProperty("c_showInMenu")
    private boolean cShowInMenu;
    @JsonProperty("c_showSubCategories")
    private boolean cShowSubCategories;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Categories() {
    }

    /**
     * 
     * @param cEnableCompare
     * @param id
     * @param cShowSubCategories
     * @param v
     * @param cShowInMenu
     * @param parentCategoryId
     * @param name
     * @param categories
     * @param type
     */
    public Categories(String v, String type, List<Category> categories, String id, String name, String parentCategoryId, boolean cEnableCompare, boolean cShowInMenu, boolean cShowSubCategories) {
        this.v = v;
        this.type = type;
        this.categories = categories;
        this.id = id;
        this.name = name;
        this.parentCategoryId = parentCategoryId;
        this.cEnableCompare = cEnableCompare;
        this.cShowInMenu = cShowInMenu;
        this.cShowSubCategories = cShowSubCategories;
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

    public Categories withV(String v) {
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

    public Categories withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The categories
     */
    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Categories withCategories(List<Category> categories) {
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

    public Categories withId(String id) {
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

    public Categories withName(String name) {
        this.name = name;
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

    public Categories withParentCategoryId(String parentCategoryId) {
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

    public Categories withCEnableCompare(boolean cEnableCompare) {
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

    public Categories withCShowInMenu(boolean cShowInMenu) {
        this.cShowInMenu = cShowInMenu;
        return this;
    }

    /**
     * 
     * @return
     *     The cShowSubCategories
     */
    @JsonProperty("c_showSubCategories")
    public boolean isCShowSubCategories() {
        return cShowSubCategories;
    }

    /**
     * 
     * @param cShowSubCategories
     *     The c_showSubCategories
     */
    @JsonProperty("c_showSubCategories")
    public void setCShowSubCategories(boolean cShowSubCategories) {
        this.cShowSubCategories = cShowSubCategories;
    }

    public Categories withCShowSubCategories(boolean cShowSubCategories) {
        this.cShowSubCategories = cShowSubCategories;
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

    public Categories withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(v).append(type).append(categories).append(id).append(name).append(parentCategoryId).append(cEnableCompare).append(cShowInMenu).append(cShowSubCategories).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Categories) == false) {
            return false;
        }
        Categories rhs = ((Categories) other);
        return new EqualsBuilder().append(v, rhs.v).append(type, rhs.type).append(categories, rhs.categories).append(id, rhs.id).append(name, rhs.name).append(parentCategoryId, rhs.parentCategoryId).append(cEnableCompare, rhs.cEnableCompare).append(cShowInMenu, rhs.cShowInMenu).append(cShowSubCategories, rhs.cShowSubCategories).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
