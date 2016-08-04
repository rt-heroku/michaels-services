
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
    "thumbnail",
    "c_dropDownViewType",
    "c_enableCompare",
    "c_hideInSitemap",
    "c_isExcludeTranslate",
    "c_isExternalUrl",
    "c_isRecommendationFromIBMcm",
    "c_navigationPromoContentAsset",
    "c_showInMenu",
    "c_showInWhatsNew",
    "c_showSubCategories",
    "c_isGridTileSlotEnabled",
    "c_isLargeViewDefault"
})
public class Category {

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
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("c_dropDownViewType")
    private String cDropDownViewType;
    @JsonProperty("c_enableCompare")
    private boolean cEnableCompare;
    @JsonProperty("c_hideInSitemap")
    private boolean cHideInSitemap;
    @JsonProperty("c_isExcludeTranslate")
    private boolean cIsExcludeTranslate;
    @JsonProperty("c_isExternalUrl")
    private boolean cIsExternalUrl;
    @JsonProperty("c_isRecommendationFromIBMcm")
    private boolean cIsRecommendationFromIBMcm;
    @JsonProperty("c_navigationPromoContentAsset")
    private String cNavigationPromoContentAsset;
    @JsonProperty("c_showInMenu")
    private boolean cShowInMenu;
    @JsonProperty("c_showInWhatsNew")
    private boolean cShowInWhatsNew;
    @JsonProperty("c_showSubCategories")
    private boolean cShowSubCategories;
    @JsonProperty("c_isGridTileSlotEnabled")
    private boolean cIsGridTileSlotEnabled;
    @JsonProperty("c_isLargeViewDefault")
    private boolean cIsLargeViewDefault;
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
     * @param cShowSubCategories
     * @param cIsRecommendationFromIBMcm
     * @param cNavigationPromoContentAsset
     * @param pageKeywords
     * @param cShowInMenu
     * @param cHideInSitemap
     * @param cIsGridTileSlotEnabled
     * @param type
     * @param cShowInWhatsNew
     * @param cIsExcludeTranslate
     * @param id
     * @param cEnableCompare
     * @param thumbnail
     * @param cDropDownViewType
     * @param pageTitle
     * @param name
     * @param parentCategoryId
     * @param cIsLargeViewDefault
     * @param cIsExternalUrl
     * @param pageDescription
     */
    public Category(String type, String id, String name, String pageDescription, String pageKeywords, String pageTitle, String parentCategoryId, String thumbnail, String cDropDownViewType, boolean cEnableCompare, boolean cHideInSitemap, boolean cIsExcludeTranslate, boolean cIsExternalUrl, boolean cIsRecommendationFromIBMcm, String cNavigationPromoContentAsset, boolean cShowInMenu, boolean cShowInWhatsNew, boolean cShowSubCategories, boolean cIsGridTileSlotEnabled, boolean cIsLargeViewDefault) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.pageDescription = pageDescription;
        this.pageKeywords = pageKeywords;
        this.pageTitle = pageTitle;
        this.parentCategoryId = parentCategoryId;
        this.thumbnail = thumbnail;
        this.cDropDownViewType = cDropDownViewType;
        this.cEnableCompare = cEnableCompare;
        this.cHideInSitemap = cHideInSitemap;
        this.cIsExcludeTranslate = cIsExcludeTranslate;
        this.cIsExternalUrl = cIsExternalUrl;
        this.cIsRecommendationFromIBMcm = cIsRecommendationFromIBMcm;
        this.cNavigationPromoContentAsset = cNavigationPromoContentAsset;
        this.cShowInMenu = cShowInMenu;
        this.cShowInWhatsNew = cShowInWhatsNew;
        this.cShowSubCategories = cShowSubCategories;
        this.cIsGridTileSlotEnabled = cIsGridTileSlotEnabled;
        this.cIsLargeViewDefault = cIsLargeViewDefault;
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
     *     The thumbnail
     */
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Category withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 
     * @return
     *     The cDropDownViewType
     */
    @JsonProperty("c_dropDownViewType")
    public String getCDropDownViewType() {
        return cDropDownViewType;
    }

    /**
     * 
     * @param cDropDownViewType
     *     The c_dropDownViewType
     */
    @JsonProperty("c_dropDownViewType")
    public void setCDropDownViewType(String cDropDownViewType) {
        this.cDropDownViewType = cDropDownViewType;
    }

    public Category withCDropDownViewType(String cDropDownViewType) {
        this.cDropDownViewType = cDropDownViewType;
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
     *     The cHideInSitemap
     */
    @JsonProperty("c_hideInSitemap")
    public boolean isCHideInSitemap() {
        return cHideInSitemap;
    }

    /**
     * 
     * @param cHideInSitemap
     *     The c_hideInSitemap
     */
    @JsonProperty("c_hideInSitemap")
    public void setCHideInSitemap(boolean cHideInSitemap) {
        this.cHideInSitemap = cHideInSitemap;
    }

    public Category withCHideInSitemap(boolean cHideInSitemap) {
        this.cHideInSitemap = cHideInSitemap;
        return this;
    }

    /**
     * 
     * @return
     *     The cIsExcludeTranslate
     */
    @JsonProperty("c_isExcludeTranslate")
    public boolean isCIsExcludeTranslate() {
        return cIsExcludeTranslate;
    }

    /**
     * 
     * @param cIsExcludeTranslate
     *     The c_isExcludeTranslate
     */
    @JsonProperty("c_isExcludeTranslate")
    public void setCIsExcludeTranslate(boolean cIsExcludeTranslate) {
        this.cIsExcludeTranslate = cIsExcludeTranslate;
    }

    public Category withCIsExcludeTranslate(boolean cIsExcludeTranslate) {
        this.cIsExcludeTranslate = cIsExcludeTranslate;
        return this;
    }

    /**
     * 
     * @return
     *     The cIsExternalUrl
     */
    @JsonProperty("c_isExternalUrl")
    public boolean isCIsExternalUrl() {
        return cIsExternalUrl;
    }

    /**
     * 
     * @param cIsExternalUrl
     *     The c_isExternalUrl
     */
    @JsonProperty("c_isExternalUrl")
    public void setCIsExternalUrl(boolean cIsExternalUrl) {
        this.cIsExternalUrl = cIsExternalUrl;
    }

    public Category withCIsExternalUrl(boolean cIsExternalUrl) {
        this.cIsExternalUrl = cIsExternalUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The cIsRecommendationFromIBMcm
     */
    @JsonProperty("c_isRecommendationFromIBMcm")
    public boolean isCIsRecommendationFromIBMcm() {
        return cIsRecommendationFromIBMcm;
    }

    /**
     * 
     * @param cIsRecommendationFromIBMcm
     *     The c_isRecommendationFromIBMcm
     */
    @JsonProperty("c_isRecommendationFromIBMcm")
    public void setCIsRecommendationFromIBMcm(boolean cIsRecommendationFromIBMcm) {
        this.cIsRecommendationFromIBMcm = cIsRecommendationFromIBMcm;
    }

    public Category withCIsRecommendationFromIBMcm(boolean cIsRecommendationFromIBMcm) {
        this.cIsRecommendationFromIBMcm = cIsRecommendationFromIBMcm;
        return this;
    }

    /**
     * 
     * @return
     *     The cNavigationPromoContentAsset
     */
    @JsonProperty("c_navigationPromoContentAsset")
    public String getCNavigationPromoContentAsset() {
        return cNavigationPromoContentAsset;
    }

    /**
     * 
     * @param cNavigationPromoContentAsset
     *     The c_navigationPromoContentAsset
     */
    @JsonProperty("c_navigationPromoContentAsset")
    public void setCNavigationPromoContentAsset(String cNavigationPromoContentAsset) {
        this.cNavigationPromoContentAsset = cNavigationPromoContentAsset;
    }

    public Category withCNavigationPromoContentAsset(String cNavigationPromoContentAsset) {
        this.cNavigationPromoContentAsset = cNavigationPromoContentAsset;
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
     *     The cShowInWhatsNew
     */
    @JsonProperty("c_showInWhatsNew")
    public boolean isCShowInWhatsNew() {
        return cShowInWhatsNew;
    }

    /**
     * 
     * @param cShowInWhatsNew
     *     The c_showInWhatsNew
     */
    @JsonProperty("c_showInWhatsNew")
    public void setCShowInWhatsNew(boolean cShowInWhatsNew) {
        this.cShowInWhatsNew = cShowInWhatsNew;
    }

    public Category withCShowInWhatsNew(boolean cShowInWhatsNew) {
        this.cShowInWhatsNew = cShowInWhatsNew;
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

    public Category withCShowSubCategories(boolean cShowSubCategories) {
        this.cShowSubCategories = cShowSubCategories;
        return this;
    }

    /**
     * 
     * @return
     *     The cIsGridTileSlotEnabled
     */
    @JsonProperty("c_isGridTileSlotEnabled")
    public boolean isCIsGridTileSlotEnabled() {
        return cIsGridTileSlotEnabled;
    }

    /**
     * 
     * @param cIsGridTileSlotEnabled
     *     The c_isGridTileSlotEnabled
     */
    @JsonProperty("c_isGridTileSlotEnabled")
    public void setCIsGridTileSlotEnabled(boolean cIsGridTileSlotEnabled) {
        this.cIsGridTileSlotEnabled = cIsGridTileSlotEnabled;
    }

    public Category withCIsGridTileSlotEnabled(boolean cIsGridTileSlotEnabled) {
        this.cIsGridTileSlotEnabled = cIsGridTileSlotEnabled;
        return this;
    }

    /**
     * 
     * @return
     *     The cIsLargeViewDefault
     */
    @JsonProperty("c_isLargeViewDefault")
    public boolean isCIsLargeViewDefault() {
        return cIsLargeViewDefault;
    }

    /**
     * 
     * @param cIsLargeViewDefault
     *     The c_isLargeViewDefault
     */
    @JsonProperty("c_isLargeViewDefault")
    public void setCIsLargeViewDefault(boolean cIsLargeViewDefault) {
        this.cIsLargeViewDefault = cIsLargeViewDefault;
    }

    public Category withCIsLargeViewDefault(boolean cIsLargeViewDefault) {
        this.cIsLargeViewDefault = cIsLargeViewDefault;
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
        return new HashCodeBuilder().append(type).append(id).append(name).append(pageDescription).append(pageKeywords).append(pageTitle).append(parentCategoryId).append(thumbnail).append(cDropDownViewType).append(cEnableCompare).append(cHideInSitemap).append(cIsExcludeTranslate).append(cIsExternalUrl).append(cIsRecommendationFromIBMcm).append(cNavigationPromoContentAsset).append(cShowInMenu).append(cShowInWhatsNew).append(cShowSubCategories).append(cIsGridTileSlotEnabled).append(cIsLargeViewDefault).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(type, rhs.type).append(id, rhs.id).append(name, rhs.name).append(pageDescription, rhs.pageDescription).append(pageKeywords, rhs.pageKeywords).append(pageTitle, rhs.pageTitle).append(parentCategoryId, rhs.parentCategoryId).append(thumbnail, rhs.thumbnail).append(cDropDownViewType, rhs.cDropDownViewType).append(cEnableCompare, rhs.cEnableCompare).append(cHideInSitemap, rhs.cHideInSitemap).append(cIsExcludeTranslate, rhs.cIsExcludeTranslate).append(cIsExternalUrl, rhs.cIsExternalUrl).append(cIsRecommendationFromIBMcm, rhs.cIsRecommendationFromIBMcm).append(cNavigationPromoContentAsset, rhs.cNavigationPromoContentAsset).append(cShowInMenu, rhs.cShowInMenu).append(cShowInWhatsNew, rhs.cShowInWhatsNew).append(cShowSubCategories, rhs.cShowSubCategories).append(cIsGridTileSlotEnabled, rhs.cIsGridTileSlotEnabled).append(cIsLargeViewDefault, rhs.cIsLargeViewDefault).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
