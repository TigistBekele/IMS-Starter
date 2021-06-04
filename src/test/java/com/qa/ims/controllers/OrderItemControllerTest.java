package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderItemController;
import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderItemDAO dao;

	@InjectMocks
	private OrderItemController controller;

//	@Test
//	public void testCreate() {
//		final Long ordersItems_id = 1L;
//
//		final Long order_id = 1L, item_id = 4L, quantity = 2L;
//
//		final Double totalCost = 378.00;
//		final OrderItem created = new OrderItem(order_id, item_id, quantity, totalCost);
//
//		Mockito.when(utils.getLong()).thenReturn(ordersItems_id);
//		Mockito.when(utils.getLong()).thenReturn(order_id, item_id, quantity);
//		Mockito.when(utils.getLong()).thenReturn(item_id);
//		Mockito.when(utils.getLong()).thenReturn(quantity);
//		Mockito.when(utils.getDouble()).thenReturn(totalCost);
//		Mockito.when(dao.create(created)).thenReturn(created);
//
//		assertEquals(created, controller.create());
//
//		Mockito.verify(utils, Mockito.times(3)).getLong();
//		Mockito.verify(utils, Mockito.times(1)).getDouble();
//		Mockito.verify(dao, Mockito.times(1)).create(created);
//	}

	@Test
	public void testReadAll() {
		List<OrderItem> orderItems = new ArrayList<>();
		orderItems.add(new OrderItem(2L, 4L, 2L, 2L, 172.18));

		Mockito.when(dao.readAll()).thenReturn(orderItems);

		assertEquals(orderItems, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

//	@Test
//	public void testUpdate() {
//		OrderItem updated = new OrderItem(1L, 3L, 2L, 1L, 86.09);
//
////		Mockito.when(this.utils.getLong()).thenReturn(1L);
//		Mockito.when(this.utils.getLong()).thenReturn(updated.getOrdersItems_id(), updated.getOrder_id(),
//				updated.getItem_id(), updated.getQuantity());
//		Mockito.when(this.utils.getDouble()).thenReturn(updated.getTotalCost());
//		Mockito.when(this.dao.update(updated)).thenReturn(updated);
//
//		assertEquals(updated, this.controller.update());
//	
//		Mockito.verify(this.utils, Mockito.times(4)).getLong();
//		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
//		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
//	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}

}
