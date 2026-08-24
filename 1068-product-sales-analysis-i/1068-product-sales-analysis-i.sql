# Write your MySQL query statement below
select product_name, year ,price from Sales join Product on product.product_id   = sales.product_id;