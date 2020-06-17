CREATE TABLE IF NOT EXISTS `t_stock_exchange` (
`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
`stock_exchange` VARCHAR(100) NOT NULL,
`brief` VARCHAR(255),
`contact_address` VARCHAR(255),
`remarks` VARCHAR(255)
);