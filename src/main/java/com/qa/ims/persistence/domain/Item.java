package com.qa.ims.persistence.domain;

public class Item {

	private Long item_id;
	private String item_name;
	private double value;

	public Item(String item_name, double value) {
		this.setItem_name(item_name);
		this.setValue(value);
	}

	public Item(Long item_id, String item_name, double value) {
		this.setItem_id(item_id);
		this.setItem_name(item_name);
		this.setValue(value);
	}

	
	
	
	public Long getItem_id() {
		return item_id;
	}
	
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "Item [item_id: " + item_id + ", item_name: " + item_name + ", value: " + value + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_id == null) ? 0 : item_id.hashCode());
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}
