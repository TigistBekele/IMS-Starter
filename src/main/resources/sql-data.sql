INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `items`(`item_name`, `value`) VALUES ('Laptop', 1494.00);
INSERT INTO `orders`(`customer_id`) VALUES (1);
INSERT INTO `orders_items`(`order_id`,`item_id`,`quantity`,`totalCost`) VALUES (1L,3L,2L,40.18);