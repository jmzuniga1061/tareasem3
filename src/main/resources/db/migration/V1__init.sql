CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    description VARCHAR(100),
    price DECIMAL(10,2),
    stock INT
);
