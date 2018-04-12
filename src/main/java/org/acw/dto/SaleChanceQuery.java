package com.shsxt.dto;

import com.shsxt.base.BaseQuery;

public class SaleChanceQuery extends BaseQuery {
	
//	private Integer page;
//	private Integer rows; 
	
	private String customerName;
	private String overview; 
	private String createMan;
	private Integer state;
	
	public Integer getDevResult() {
		return devResult;
	}
	public void setDevResult(Integer devResult) {
		this.devResult = devResult;
	}
	private Integer devResult; // 开发状态 0=未开发 1=开发中 2=开发完成 3=开发失败
	
//	public Integer getPage() {
//		return page;
//	}
//	public void setPage(Integer page) {
//		this.page = page;
//	}
//	public Integer getRows() {
//		return rows;
//	}
//	public void setRows(Integer rows) {
//		this.rows = rows;
//	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getCreateMan() {
		return createMan;
	}
	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
}
