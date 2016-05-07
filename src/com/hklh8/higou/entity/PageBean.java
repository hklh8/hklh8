package com.hklh8.higou.entity;

import java.util.List;

/**
 * 封装每一页数据的实体类
 * @author GouBo
 */
public class PageBean<T> {
	private List<T> data;        //数据
	private int pageSize;		 //每一页多少条记录
	private int actualPageSize;  //实际每页多少条记录
	private int page;            //当前第几页
	private int totalPage;       //总共多少页
	private int totalNum;        //总记录数
	
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getActualPageSize() {
		return actualPageSize;
	}
	public void setActualPageSize(int actualPageSize) {
		this.actualPageSize = actualPageSize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	
	
}
