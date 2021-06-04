package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	
	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}
	

	
	@Override
	public Item create() {
		LOGGER.info("Please enter a item name");
		String Item_name = utils.getString();
		LOGGER.info("Please enter a value");
		Double Value = utils.getDouble();
		Item item = itemDAO.create(new Item(Item_name, Value));
		LOGGER.info("Item created");
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long item_id = utils.getLong();
		LOGGER.info("Please enter a Item name");
		String item_name = utils.getString();
		LOGGER.info("Please enter a value");
		Double value = utils.getDouble();
		Item item = itemDAO.update(new Item(item_id, item_name, value));
		LOGGER.info("Item Updated");
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the Item you would like to delete");
		Long item_id = utils.getLong();
		int item = itemDAO.delete(item_id);
		LOGGER.info("Item Deleted");
		return item;
	}

}
