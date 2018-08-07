package org.lxh.myzngt.vo;

public class Subitem {
	private int subid ;
	private String subname ;
	private String itemid ;
	private int subcode ;
	private Item item ;
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getSubcode() {
		return subcode;
	}
	public void setSubcode(int subcode) {
		this.subcode = subcode;
	}
}
