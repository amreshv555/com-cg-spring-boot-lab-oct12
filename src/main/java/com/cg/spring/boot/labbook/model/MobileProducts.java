package com.cg.spring.boot.labbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mobile_Products_Details")
public class MobileProducts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id",unique = true)
	private int productId;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@Column(name = "model_name")
	private String modelName;
	
	@Column(name = "ram_size")
	private int ramSize;
	
	@Column(name = "internal_memory_size")
	private int internalMemorySize;
	
	@Column(name = "screen_size")
	private int screenSize;
	
	@Column(name="operating_system_type")
	private String operatingSystemType;
	
	@Column(name="version")
	private double version;
	
	@Column(name="release_date")
	private String releaseDate;

	public MobileProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileProducts(int productId, String brandName, String modelName, int ramSize, int internalMemorySize,
			int screenSize, String operatingSystemType, double version, String releaseDate) {
		super();
		this.productId = productId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.ramSize = ramSize;
		this.internalMemorySize = internalMemorySize;
		this.screenSize = screenSize;
		this.operatingSystemType = operatingSystemType;
		this.version = version;
		this.releaseDate = releaseDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getInternalMemorySize() {
		return internalMemorySize;
	}

	public void setInternalMemorySize(int internalMemorySize) {
		this.internalMemorySize = internalMemorySize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getOperatingSystemType() {
		return operatingSystemType;
	}

	public void setOperatingSystemType(String operatingSystemType) {
		this.operatingSystemType = operatingSystemType;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "MobileProducts [productId=" + productId + ", brandName=" + brandName + ", modelName=" + modelName
				+ ", ramSize=" + ramSize + ", internalMemorySize=" + internalMemorySize + ", screenSize=" + screenSize
				+ ", operatingSystemType=" + operatingSystemType + ", version=" + version + ", releaseDate="
				+ releaseDate + "]";
	}
	
	
	

}
