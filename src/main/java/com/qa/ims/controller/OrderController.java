package com.qa.ims.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
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
	public Order create() {
		LOGGER.info("Please enter a customer_id");
		Long customerId = utils.getLong();
//		LOGGER.info("Please enter a item_id");
//		Long itemId = utils.getLong();
//		LOGGER.info("Please enter a quantity");
//		Long quantity = utils.getLong();
//		Double totalCost = calculateTotalCost(itemId) * quantity;
		Order order = orderDAO.create(new Order(customerId));
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter a customer_id");
		Long CustomerId = utils.getLong();
		Order order = orderDAO.update(new Order(order_id, CustomerId));
		LOGGER.info("Order Updated");
		return order;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long order_id = utils.getLong();
		int orde = orderDAO.delete(order_id);
		LOGGER.info("Order Deleted");
		return orde;
	}

}
