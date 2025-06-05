-- Question 1
USE northwind;
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);
-- Question 2
USE northwind;
SELECT OrderID, ShipName, ShipAddress, ShipVia
FROM orders
WHERE ShipVia IN (SELECT ShipperID
					FROM Shippers
                    WHERE CompanyName LIKE "%Federal Shipping%");
