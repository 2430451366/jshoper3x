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
 * GoodsGroupT generated by hbm2java
 */
@Entity
@Table(name = "goods_group_t", catalog = "jshoper3")
public class GoodsGroupT implements java.io.Serializable {

	private String groupid;
	private String goodsid;
	private String goodsname;
	private String state;
	private Date begintime;
	private Date endtime;
	private String creatorid;
	private Date createtime;
	private String cashstate;
	private Double cashlimit;
	private int limitbuy;
	private int salequantity;
	private int SOrderCount;
	private int totalOrderCount;
	private double sendpoint;
	private String priceladder;
	private String detail;
	private String pictureurl;
	private String htmlpath;
	private double memberprice;
	private double groupprice;
	private String placename;

	public GoodsGroupT() {
	}

	public GoodsGroupT(String groupid, String goodsid, String goodsname,
			String state, Date begintime, Date endtime, String creatorid,
			Date createtime, String cashstate, int limitbuy, int salequantity,
			int SOrderCount, int totalOrderCount, double sendpoint,
			String detail, String pictureurl, String htmlpath,
			double memberprice, double groupprice, String placename) {
		this.groupid = groupid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.state = state;
		this.begintime = begintime;
		this.endtime = endtime;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.cashstate = cashstate;
		this.limitbuy = limitbuy;
		this.salequantity = salequantity;
		this.SOrderCount = SOrderCount;
		this.totalOrderCount = totalOrderCount;
		this.sendpoint = sendpoint;
		this.detail = detail;
		this.pictureurl = pictureurl;
		this.htmlpath = htmlpath;
		this.memberprice = memberprice;
		this.groupprice = groupprice;
		this.placename = placename;
	}

	public GoodsGroupT(String groupid, String goodsid, String goodsname,
			String state, Date begintime, Date endtime, String creatorid,
			Date createtime, String cashstate, Double cashlimit, int limitbuy,
			int salequantity, int SOrderCount, int totalOrderCount,
			double sendpoint, String priceladder, String detail,
			String pictureurl, String htmlpath, double memberprice,
			double groupprice, String placename) {
		this.groupid = groupid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.state = state;
		this.begintime = begintime;
		this.endtime = endtime;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.cashstate = cashstate;
		this.cashlimit = cashlimit;
		this.limitbuy = limitbuy;
		this.salequantity = salequantity;
		this.SOrderCount = SOrderCount;
		this.totalOrderCount = totalOrderCount;
		this.sendpoint = sendpoint;
		this.priceladder = priceladder;
		this.detail = detail;
		this.pictureurl = pictureurl;
		this.htmlpath = htmlpath;
		this.memberprice = memberprice;
		this.groupprice = groupprice;
		this.placename = placename;
	}

	@Id
	@Column(name = "GROUPID", unique = true, nullable = false, length = 20)
	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINTIME", nullable = false, length = 0)
	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDTIME", nullable = false, length = 0)
	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CASHSTATE", nullable = false, length = 1)
	public String getCashstate() {
		return this.cashstate;
	}

	public void setCashstate(String cashstate) {
		this.cashstate = cashstate;
	}

	@Column(name = "CASHLIMIT", precision = 10)
	public Double getCashlimit() {
		return this.cashlimit;
	}

	public void setCashlimit(Double cashlimit) {
		this.cashlimit = cashlimit;
	}

	@Column(name = "LIMITBUY", nullable = false)
	public int getLimitbuy() {
		return this.limitbuy;
	}

	public void setLimitbuy(int limitbuy) {
		this.limitbuy = limitbuy;
	}

	@Column(name = "SALEQUANTITY", nullable = false)
	public int getSalequantity() {
		return this.salequantity;
	}

	public void setSalequantity(int salequantity) {
		this.salequantity = salequantity;
	}

	@Column(name = "S_ORDER_COUNT", nullable = false)
	public int getSOrderCount() {
		return this.SOrderCount;
	}

	public void setSOrderCount(int SOrderCount) {
		this.SOrderCount = SOrderCount;
	}

	@Column(name = "TOTAL_ORDER_COUNT", nullable = false)
	public int getTotalOrderCount() {
		return this.totalOrderCount;
	}

	public void setTotalOrderCount(int totalOrderCount) {
		this.totalOrderCount = totalOrderCount;
	}

	@Column(name = "SENDPOINT", nullable = false, precision = 10)
	public double getSendpoint() {
		return this.sendpoint;
	}

	public void setSendpoint(double sendpoint) {
		this.sendpoint = sendpoint;
	}

	@Column(name = "PRICELADDER", length = 500)
	public String getPriceladder() {
		return this.priceladder;
	}

	public void setPriceladder(String priceladder) {
		this.priceladder = priceladder;
	}

	@Column(name = "DETAIL", nullable = false)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "PICTUREURL", nullable = false)
	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	@Column(name = "HTMLPATH", nullable = false)
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	@Column(name = "MEMBERPRICE", nullable = false, precision = 10)
	public double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(double memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "GROUPPRICE", nullable = false, precision = 10)
	public double getGroupprice() {
		return this.groupprice;
	}

	public void setGroupprice(double groupprice) {
		this.groupprice = groupprice;
	}

	@Column(name = "PLACENAME", nullable = false, length = 100)
	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

}
