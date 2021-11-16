package com.xworkz.mobile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class MobileEntity {

	@Id
	@Column(name = "MOBILE_ID")
	private int mobileID;

	@Column(name = "MOBILE_BRAND")
	private String mobileBrand;

	@Column(name = "MOBILE_PRICE")
	private Double mobileprice;

	@Column(name = "MOBILE_ROM")
	private String mobileRom;

	@Column(name = "MOBILE_COLOR")
	private String mobilecolor;

	@Column(name = "MOBILE_CAMERSIZE")
	private Double mobilecamersize;

	@Column(name = "MOBILE_FINGERPRINTSUPPORTED")
	private Boolean mobileisfingerPrintsupported;

	@Column(name = "MOBILE_OSTYPE")
	private String mobileOSType;

	private double cameraInPicel;

	public MobileEntity(int mobileID, String mobileBrand, Double mobileprice, String mobileRom, String mobilecolor,
			 Double mobilecamersize , Boolean mobileisfingerPrintsupported, String mobileOSType) {
		super();
		this.mobileID = mobileID;
		this.mobileBrand = mobileBrand;
		this.mobileprice = mobileprice;
		this.mobileRom = mobileRom;
		this.mobilecolor = mobilecolor;
		this.mobilecamersize =mobilecamersize;
		this.mobileisfingerPrintsupported = mobileisfingerPrintsupported;
		this.mobileOSType = mobileOSType;
	}

	public int getMobileId() {
		return mobileID;
	}

	public void setMobileId(int mobileId) {
		this.mobileID = mobileId;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getMobilePrice() {
		return mobileprice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobileprice = mobilePrice;
	}

	public String getRom() {
		return mobileRom;
	}

	public void setRom(String rom) {
		this.mobileRom = rom;
	}

	public String getColor() {
		return mobilecolor;
	}

	public void setColor(String color) {
		this.mobilecolor = color;
	}

	public double getCameraInPicel() {
		return cameraInPicel;
	}

	public void setCameraInPicel(double cameraInPicel) {
		this.cameraInPicel = cameraInPicel;
	}

	public boolean isFingerPrintAvailable() {
		return mobileisfingerPrintsupported;
	}

	public void setFingerPrintAvailable(boolean isFingerPrintAvailable) {
		this.mobileisfingerPrintsupported = isFingerPrintAvailable;
	}

	public String getOstype() {
		return mobileOSType;
	}

	public void setOstype(String ostype) {
		this.mobileOSType = ostype;
	}

}
