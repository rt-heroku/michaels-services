package com.heroku.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

@Entity
@Table(name="product_location")
@NamedQueries ( {
  @NamedQuery ( name="ProductLocation.countAll", query="SELECT COUNT(x) FROM ProductLocation x" )
} )
public class ProductLocation implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6324634533857431657L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Integer    id           ;

    @Column(name="store", length=80)
    private String     store    ;
    @Column(name="sku", length=50)
    private String     sku    ;
    @Column(name="aisle", length=50)
    private String     aisle; 
    @Column(name="country_id", length=50)
    private String     	countryId    ;
	@Column(name="state_id", length=50)
    private String     	stateId    ;
	@Column(name="pog_dept", length=50)
    private String     	pogDept    ;
	@Column(name="pog_number", length=50)
    private String     	pogNumber    ;
	@Column(name="pog_level", length=50)
    private String     	pogLevel    ;
	@Column(name="transmit_date", length=50)
    private String     	transmitDate ;   
	@Column(name="start_date", length=50)
    private String     	startDate ;   
	@Column(name="complete_date", length=50)
    private String     	completeDate;    
	@Column(name="deactivate_date", length=50)
    private String     	deactivateDate; 
	@Column(name="pog_id", length=50)
    private String     	pogId;    
	@Column(name="descr", length=50)
    private String     	descr;    
	@Column(name="sku_type", length=50)
    private String     	skuType;    
	@Column(name="dept_desc", length=50)
    private String     	deptDesc    ;
	@Column(name="dept", length=50)
    private String     	dept;
	
	public ProductLocation(){
		super();
	}
	
	public ProductLocation update(ProductLocation p){
		try {
			BeanUtils.copyProperties(this, p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getAisle() {
		return aisle;
	}
	public void setAisle(String aisle) {
		this.aisle = aisle;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getPogDept() {
		return pogDept;
	}
	public void setPogDept(String pogDept) {
		this.pogDept = pogDept;
	}
	public String getPogNumber() {
		return pogNumber;
	}
	public void setPogNumber(String pogNumber) {
		this.pogNumber = pogNumber;
	}
	public String getPogLevel() {
		return pogLevel;
	}
	public void setPogLevel(String pogLevel) {
		this.pogLevel = pogLevel;
	}
	public String getTransmitDate() {
		return transmitDate;
	}
	public void setTransmitDate(String transmitDate) {
		this.transmitDate = transmitDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCompleteDate() {
		return completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}
	public String getDeactivateDate() {
		return deactivateDate;
	}
	public void setDeactivateDate(String deactivateDate) {
		this.deactivateDate = deactivateDate;
	}
	public String getPogId() {
		return pogId;
	}
	public void setPogId(String pogId) {
		this.pogId = pogId;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getSkuType() {
		return skuType;
	}
	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
}
