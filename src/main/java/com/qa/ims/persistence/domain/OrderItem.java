package com.qa.ims.persistence.domain;

public class OrderItem {

	private Long ordersItems_id;
	private Long order_id;
	private Long item_id;
	private Long quantity;
	private Double totalCost;

	public OrderItem(Long order_id, Long item_id, Long quantity, Double totalCost) {
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	public OrderItem(Long ordersItems_id, Long order_id, Long item_id, Long quantity, Double totalCost) {
		this.ordersItems_id = ordersItems_id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	
	public Long getOrdersItems_id() {
		return ordersItems_id;
	}

	public void setOrdersItems_id(Long ordersItems_id) {
		this.ordersItems_id = ordersItems_id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "OrderItem [ordersItems_id: " + ordersItems_id + ", order_id: " + order_id + ", item_id: " + item_id
				+ ", quantity: " + quantity + ", totalCost: " + totalCost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_id == null) ? 0 : item_id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((ordersItems_id == null) ? 0 : ordersItems_id.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
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
		OrderItem other = (OrderItem) obj;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (ordersItems_id == null) {
			if (other.ordersItems_id != null)
				return false;
		} else if (!ordersItems_id.equals(other.ordersItems_id))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		return true;
	}

}
