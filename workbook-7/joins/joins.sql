USE northwind;
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName
FROM categories c 
JOIN products p ON c.CategoryName = p.ProductName;
Order by