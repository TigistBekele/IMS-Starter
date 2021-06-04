drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

  DROP TABLE IF EXISTS `items`;
  
  CREATE TABLE IF NOT EXISTS `items` (
    `item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `value` DOUBLE DEFAULT NULL,
    PRIMARY KEY (`item_id`)
);


 DROP TABLE IF EXISTS `orders`;
 
CREATE TABLE IF NOT EXISTS `orders`(
	`order_id` INT NOT NULL AUTO_INCREMENT,
	`customer_id` INT NOT NULL,
	primary key(`order_id`),
	foreign key (`customer_id`) references customers(`id`)
);

 DROP TABLE IF EXISTS `orders_items`; 
 
CREATE TABLE IF NOT EXISTS `orders_items`(
	`ordersItems_id` INT NOT NULL AUTO_INCREMENT,
	`order_id` INT NOT NULL,
	`item_id` INT NOT NULL,
	`quantity` INT Not Null,
	`totalCost` Double Not Null,
	primary key(`ordersItems_id`),
	foreign key (`order_id`) references orders(`order_id`),
	foreign key (`item_id`) references items(`item_id`)
);