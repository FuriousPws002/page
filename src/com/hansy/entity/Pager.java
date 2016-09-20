package com.hansy.entity;

import java.util.List;

/**
 * 分页实体类
 * @author Furious
 *
 * @param <T>
 */
public class Pager<T> {

	private int ps;//每页大小数
	private int pc;//当前页
	private int pt;//总也数
	private int count;//总条目数
	private List<T> list;//每页数据集
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getPt() {
		pt=count / ps;
		return count % ps == 0 ? pt : pt+1;
	}
//	public void setPt(int pt) {
//		this.pt = pt;
//	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
}
