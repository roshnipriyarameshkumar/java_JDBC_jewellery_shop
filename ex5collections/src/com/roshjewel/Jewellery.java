package com.roshjewel;

public class Jewellery implements Comparable<Jewellery> {
	private String name;
	private String shop_name;
	private String branch;
	private String jewel_type;
	private int quantity;
	private String id;
	public Jewellery() {
		
	}
	
	
	public Jewellery(String name, String shop_name, String branch, String jewel_type, int quantity) {
		super();
		this.name = name;
		this.shop_name = shop_name;
		this.branch = branch;
		this.jewel_type = jewel_type;
		this.quantity = quantity;
		
	}


	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getJewel_type() {
		return jewel_type;
	}
	public void setJewel_type(String jewel_type) {
		this.jewel_type = jewel_type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Jewellery [name=" + name + ", shop_name=" + shop_name + ", branch=" + branch + ", jewel_type="
				+ jewel_type + ", quantity=" + quantity + ", id=" + id + "]";
	}

	public int compareTo(Jewellery jw)
	{
		return (this.name).compareTo(jw.name);
	}


	public String generateId(Jewellery j) {
		String s=((Jewellery) j).getName().toUpperCase().substring(0,2);
		String str=s+((Jewellery) j).getShop_name().toUpperCase().substring(0,3);
		return str;
	}
	
}
