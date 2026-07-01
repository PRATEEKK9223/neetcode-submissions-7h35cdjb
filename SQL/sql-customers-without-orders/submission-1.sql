-- Write your query below
SELECT Name from customers C where  Not Exists (SELECT * FROM orders O where C.id=O.customer_id);