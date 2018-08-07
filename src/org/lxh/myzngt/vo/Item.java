package org.lxh.myzngt.vo;

import java.util.Set;

public class Item {
	private int itemid ;
	private String itemname ;
	private int itemcode ;
	private Set subitems ;
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Set getSubitems() {
		return subitems;
	}
	public void setSubitems(Set subitems) {
		this.subitems = subitems;
	}
	
}
