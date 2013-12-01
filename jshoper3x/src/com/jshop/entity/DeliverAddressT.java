package com.jshop.entity;

// Generated 2013-12-1 23:33:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DeliverAddressT generated by hbm2java
 */
@Entity
@Table(name = "deliver_address_t", catalog = "jshoper3")
public class DeliverAddressT implements java.io.Serializable {

	private String addressid;
	private String memberid;
	private String shippingusername;
	private String province;
	private String city;
	private String district;
	private String street;
	private String postcode;
	private String telno;
	private String mobile;
	private String email;
	private Date createtime;
	private String state;
	private String country;

	public DeliverAddressT() {
	}

	public DeliverAddressT(String addressid, String memberid,
			String shippingusername, String province, String city,
			String district, String street, String postcode, String mobile,
			Date createtime, String state, String country) {
		this.addressid = addressid;
		this.memberid = memberid;
		this.shippingusername = shippingusername;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.mobile = mobile;
		this.createtime = createtime;
		this.state = state;
		this.country = country;
	}

	public DeliverAddressT(String addressid, String memberid,
			String shippingusername, String province, String city,
			String district, String street, String postcode, String telno,
			String mobile, String email, Date createtime, String state,
			String country) {
		this.addressid = addressid;
		this.memberid = memberid;
		this.shippingusername = shippingusername;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.postcode = postcode;
		this.telno = telno;
		this.mobile = mobile;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.country = country;
	}

	@Id
	@Column(name = "ADDRESSID", unique = true, nullable = false, length = 20)
	public String getAddressid() {
		return this.addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "SHIPPINGUSERNAME", nullable = false, length = 45)
	public String getShippingusername() {
		return this.shippingusername;
	}

	public void setShippingusername(String shippingusername) {
		this.shippingusername = shippingusername;
	}

	@Column(name = "PROVINCE", nullable = false, length = 12)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", nullable = false, length = 12)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "DISTRICT", nullable = false, length = 12)
	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(name = "STREET", nullable = false, length = 100)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "POSTCODE", nullable = false, length = 10)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "TELNO", length = 20)
	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "MOBILE", nullable = false, length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "COUNTRY", nullable = false, length = 20)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
