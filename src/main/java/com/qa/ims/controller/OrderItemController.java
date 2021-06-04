package com.qa.ims.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.DBUtils;
import com.qa.ims.utils.Utils;

public class OrderItemController implements CrudController<OrderItem> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderItemDAO orderItemDAO;
	private Utils utils;

	public OrderItemController(OrderItemDAO orderItemDAO, Utils utils) {

		this.orderItemDAO = orderItemDAO;
		this.utils = utils;
	}

	
	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> ordersItems = orderItemDAO.readAll();
		for (OrderItem orderItem : ordersItems) {
			LOGGER.info(orderItem);
		}
		return ordersItems;
	}

	public Double calculateTotalCost(Long itemId) {
		Double getValue = 0.0;

		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * from items");) {
			while (resultSet.next()) {

				if (itemId == resultSet.getLong("item_id")) {
					getValue = resultSet.getDouble("value");

				}
			}
			return getValue;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());

		}
		return getValue;

	}

	@Override
	public OrderItem create() {
		LOGGER.info("Please enter a order_id");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter a item_id");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		Double totalCost = calculateTotalCost(itemId) * quantity;
		OrderItem orderItem = orderItemDAO.create(new OrderItem(orderId, itemId, quantity, totalCost));
		LOGGER.info("ItemOrderd created");
		return orderItem;
	}

	@Override
	public OrderItem update() {
		LOGGER.info("Please enter the id of the orders_items you would like to update");
		Long ordersItems_id = utils.getLong();
		LOGGER.info("Please enter a order_id");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter a item_id");
		Long item_id = utils.getLong();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		Double totalcost = calculateTotalCost(item_id) * quantity;
		OrderItem orderItem = orderItemDAO
				.update(new OrderItem(ordersItems_id, order_id, item_id, quantity, totalcost));
		LOGGER.info("Order_item Updated");
		return orderItem;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order_item you would like to delete");
		Long ordersItems_id = utils.getLong();
		int cus = orderItemDAO.delete(ordersItems_id);
		LOGGER.info("order_item Deleted");
		return cus;
	}

}
