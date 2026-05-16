
CREATE DATABASE IF NOT EXISTS ecommerce_order_system;
USE ecommerce_order_system;

CREATE TABLE user(
    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(100),
    phone VARCHAR(20),
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE product(
    product_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100),
    price DECIMAL(10,2),
    stock INT,
    description TEXT
);

CREATE TABLE orders(
    order_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT,
    total_amount DECIMAL(10,2),
    order_status VARCHAR(20),
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);
