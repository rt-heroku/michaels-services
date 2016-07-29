
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
    "_v",
    "_type",
    "count",
    "hits",
    "query",
    "refinements",
    "sorting_options",
    "start",
    "total"
})
public class ProductSearch {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("count")
    private long count;
    @JsonProperty("hits")
    private List<Hit> hits = new ArrayList<Hit>();
    @JsonProperty("query")
    private String query;
    @JsonProperty("refinements")
    private List<Refinement> refinements = new ArrayList<Refinement>();
    @JsonProperty("sorting_options")
    private List<SortingOption> sortingOptions = new ArrayList<SortingOption>();
    @JsonProperty("start")
    private long start;
    @JsonProperty("total")
    private long total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductSearch() {
    }

    /**
     * 
     * @param total
     * @param refinements
     * @param v
     * @param hits
     * @param count
     * @param start
     * @param query
     * @param type
     * @param sortingOptions
     */
    public ProductSearch(String v, String type, long count, List<Hit> hits, String query, List<Refinement> refinements, List<SortingOption> sortingOptions, long start, long total) {
        this.v = v;
        this.type = type;
        this.count = count;
        this.hits = hits;
        this.query = query;
        this.refinements = refinements;
        this.sortingOptions = sortingOptions;
        this.start = start;
        this.total = total;
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

    public ProductSearch withV(String v) {
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

    public ProductSearch withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public long getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(long count) {
        this.count = count;
    }

    public ProductSearch withCount(long count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The hits
     */
    @JsonProperty("hits")
    public List<Hit> getHits() {
        return hits;
    }

    /**
     * 
     * @param hits
     *     The hits
     */
    @JsonProperty("hits")
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public ProductSearch withHits(List<Hit> hits) {
        this.hits = hits;
        return this;
    }

    /**
     * 
     * @return
     *     The query
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * 
     * @param query
     *     The query
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public ProductSearch withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 
     * @return
     *     The refinements
     */
    @JsonProperty("refinements")
    public List<Refinement> getRefinements() {
        return refinements;
    }

    /**
     * 
     * @param refinements
     *     The refinements
     */
    @JsonProperty("refinements")
    public void setRefinements(List<Refinement> refinements) {
        this.refinements = refinements;
    }

    public ProductSearch withRefinements(List<Refinement> refinements) {
        this.refinements = refinements;
        return this;
    }

    /**
     * 
     * @return
     *     The sortingOptions
     */
    @JsonProperty("sorting_options")
    public List<SortingOption> getSortingOptions() {
        return sortingOptions;
    }

    /**
     * 
     * @param sortingOptions
     *     The sorting_options
     */
    @JsonProperty("sorting_options")
    public void setSortingOptions(List<SortingOption> sortingOptions) {
        this.sortingOptions = sortingOptions;
    }

    public ProductSearch withSortingOptions(List<SortingOption> sortingOptions) {
        this.sortingOptions = sortingOptions;
        return this;
    }

    /**
     * 
     * @return
     *     The start
     */
    @JsonProperty("start")
    public long getStart() {
        return start;
    }

    /**
     * 
     * @param start
     *     The start
     */
    @JsonProperty("start")
    public void setStart(long start) {
        this.start = start;
    }

    public ProductSearch withStart(long start) {
        this.start = start;
        return this;
    }

    /**
     * 
     * @return
     *     The total
     */
    @JsonProperty("total")
    public long getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    @JsonProperty("total")
    public void setTotal(long total) {
        this.total = total;
    }

    public ProductSearch withTotal(long total) {
        this.total = total;
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

    public ProductSearch withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(v).append(type).append(count).append(hits).append(query).append(refinements).append(sortingOptions).append(start).append(total).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductSearch) == false) {
            return false;
        }
        ProductSearch rhs = ((ProductSearch) other);
        return new EqualsBuilder().append(v, rhs.v).append(type, rhs.type).append(count, rhs.count).append(hits, rhs.hits).append(query, rhs.query).append(refinements, rhs.refinements).append(sortingOptions, rhs.sortingOptions).append(start, rhs.start).append(total, rhs.total).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
