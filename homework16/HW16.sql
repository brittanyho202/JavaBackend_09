CREATE DATABASE IF NOT EXISTS QLCustomers
USE QLCustomers

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    City VARCHAR(50),
    Age INT
);

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    Category VARCHAR(50),
    Price DECIMAL(10,2)
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    ProductID INT,
    Quantity INT,
    OrderDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

INSERT INTO Customers (CustomerID, Name, Email, City, Age) VALUES
(1, 'Nguyen Van A', 'a1@gmail.com', 'Hanoi', 25),
(2, 'Tran Thi B', 'b2@gmail.com', 'HCMC', 30),
(3, 'Le Van C', 'c3@gmail.com', 'Da Nang', 22),
(4, 'Pham Thi D', 'd4@gmail.com', 'Hanoi', 28),
(5, 'Hoang Van E', 'e5@gmail.com', 'Can Tho', 35),
(6, 'Do Thi F', 'f6@gmail.com', 'Hanoi', 27),
(7, 'Nguyen Van G', 'g7@gmail.com', 'Hue', 31),
(8, 'Tran Thi H', 'h8@gmail.com', 'HCMC', 23),
(9, 'Le Van I', 'i9@gmail.com', 'Hanoi', 29),
(10, 'Pham Thi J', 'j10@gmail.com', 'Haiphong', 26),
(11, 'Nguyen Van K', 'k11@gmail.com', 'Hanoi', 24),
(12, 'Tran Thi L', 'l12@gmail.com', 'HCMC', 33),
(13, 'Le Van M', 'm13@gmail.com', 'Hue', 21),
(14, 'Pham Thi N', 'n14@gmail.com', 'Hanoi', 32),
(15, 'Hoang Van O', 'o15@gmail.com', 'Da Nang', 36),
(16, 'Do Thi P', 'p16@gmail.com', 'Hanoi', 25),
(17, 'Nguyen Van Q', 'q17@gmail.com', 'Can Tho', 38),
(18, 'Tran Thi R', 'r18@gmail.com', 'HCMC', 27),
(19, 'Le Van S', 's19@gmail.com', 'Hanoi', 29),
(20, 'Pham Thi T', 't20@gmail.com', 'Hue', 24),
(21, 'Nguyen Van U', 'u21@gmail.com', 'Hanoi', 23),
(22, 'Tran Thi V', 'v22@gmail.com', 'Da Nang', 34),
(23, 'Le Van W', 'w23@gmail.com', 'HCMC', 31),
(24, 'Pham Thi X', 'x24@gmail.com', 'Hanoi', 22),
(25, 'Hoang Van Y', 'y25@gmail.com', 'Hue', 28),
(26, 'Do Thi Z', 'z26@gmail.com', 'Hanoi', 26),
(27, 'Nguyen Van AA', 'aa27@gmail.com', 'HCMC', 35),
(28, 'Tran Thi BB', 'bb28@gmail.com', 'Haiphong', 30),
(29, 'Le Van CC', 'cc29@gmail.com', 'Hanoi', 27),
(30, 'Pham Thi DD', 'dd30@gmail.com', 'Da Nang', 32);

INSERT INTO Products (ProductID, ProductName, Category, Price) VALUES
(1, 'Laptop Dell', 'Electronics', 15000000),
(2, 'iPhone 13', 'Electronics', 21000000),
(3, 'Tivi Samsung', 'Electronics', 12000000),
(4, 'Bàn làm việc', 'Furniture', 3000000),
(5, 'Ghế xoay', 'Furniture', 1500000),
(6, 'Máy in Canon', 'Electronics', 2500000),
(7, 'Nồi cơm điện', 'Home Appliances', 1000000),
(8, 'Máy giặt LG', 'Home Appliances', 7000000),
(9, 'Bếp từ', 'Home Appliances', 4500000),
(10, 'Bàn phím cơ', 'Electronics', 900000),
(11, 'Chuột Logitech', 'Electronics', 600000),
(12, 'Tai nghe Sony', 'Electronics', 1200000),
(13, 'Tủ lạnh Sharp', 'Home Appliances', 8500000),
(14, 'Ghế gaming', 'Furniture', 2500000),
(15, 'Máy hút bụi', 'Home Appliances', 3500000),
(16, 'Máy sấy tóc', 'Home Appliances', 400000),
(17, 'iPad Air', 'Electronics', 17000000),
(18, 'MacBook Air', 'Electronics', 27000000),
(19, 'Quạt máy', 'Home Appliances', 600000),
(20, 'Tủ quần áo', 'Furniture', 4000000),
(21, 'Điện thoại Oppo', 'Electronics', 6000000),
(22, 'Máy lọc không khí', 'Home Appliances', 3200000),
(23, 'Giường ngủ', 'Furniture', 7000000),
(24, 'Bình đun siêu tốc', 'Home Appliances', 500000),
(25, 'Điện thoại Xiaomi', 'Electronics', 5000000),
(26, 'Đèn học LED', 'Home Appliances', 350000),
(27, 'Camera an ninh', 'Electronics', 2000000),
(28, 'Ổ cứng SSD', 'Electronics', 1500000),
(29, 'Router Wifi', 'Electronics', 1300000),
(30, 'TV LG OLED', 'Electronics', 29000000);

INSERT INTO Orders (OrderID, CustomerID, ProductID, Quantity, OrderDate) VALUES
(1, 1, 1, 1, '2025-01-02'),
(2, 2, 2, 2, '2025-01-04'),
(3, 3, 3, 1, '2025-01-05'),
(4, 4, 4, 3, '2025-01-10'),
(5, 5, 5, 2, '2025-01-11'),
(6, 6, 6, 1, '2025-01-15'),
(7, 7, 7, 4, '2025-01-17'),
(8, 8, 8, 1, '2025-01-18'),
(9, 9, 9, 2, '2025-01-20'),
(10, 10, 10, 3, '2025-01-21'),
(11, 11, 11, 1, '2025-01-23'),
(12, 12, 12, 2, '2025-01-24'),
(13, 13, 13, 1, '2025-01-25'),
(14, 14, 14, 2, '2025-01-27'),
(15, 15, 15, 1, '2025-01-28'),
(16, 16, 16, 3, '2025-01-29'),
(17, 17, 17, 1, '2025-01-30'),
(18, 18, 18, 2, '2025-02-01'),
(19, 19, 19, 2, '2025-02-02'),
(20, 20, 20, 1, '2025-02-03'),
(21, 21, 21, 1, '2025-02-05'),
(22, 22, 22, 1, '2025-02-06'),
(23, 23, 23, 2, '2025-02-07'),
(24, 24, 24, 3, '2025-02-08'),
(25, 25, 25, 1, '2025-02-09'),
(26, 26, 26, 2, '2025-02-10'),
(27, 27, 27, 1, '2025-02-11'),
(28, 28, 28, 1, '2025-02-13'),
(29, 29, 29, 1, '2025-02-15'),
(30, 30, 30, 2, '2025-02-16'),
(31, 30, 19, 3, '2025-03-16'); -- Added for testing

-- HOMEWORK QUESIONS:
-- 1.	Tìm tất cả khách hàng ở thành phố "Hanoi"
SELECT * FROM Customers WHERE City = 'Hanoi'

-- 2.	Tìm tất cả sản phẩm có giá trên 500,000 VND
SELECT * FROM Products WHERE Price > 500000

-- 3.	Đếm số đơn hàng theo từng khách hàng
-- SELECT = GIVE ME, I WANT
-- If a column is not inside an aggregate function (like COUNT(), SUM(), etc.), it must be in the GROUP BY.
SELECT od.CustomerID, c.Name, COUNT(od.OrderID) as OrderCount
FROM Orders as od
INNER JOIN Customers as c ON od.CustomerID = c.CustomerID
GROUP BY od.CustomerID, c.Name;

-- BONUS: Connect order and custormers (Customers.Name, )
WITH OrderDetails AS (	
	SELECT o.OrderID, o.CustomerID, c.Name, o.ProductID, o.Quantity, o.OrderDate
	FROM Orders as o
	INNER JOIN Customers as c
	ON o.CustomerID = c.CustomerID
	ORDER By o.OrderID
)

SELECT od.OrderID, od.CustomerID, od.Name, od.ProductID, p.ProductName, od.Quantity, od.OrderDate
FROM OrderDetails as od
INNER JOIN Products as p
ON od.ProductID = p.ProductID;

-- other way to write this:
SELECT od.OrderID, od.CustomerID, c.Name, od.ProductID, p.ProductName, od.Quantity, od.OrderDate
FROM Orders AS od
INNER JOIN Products AS p ON od.ProductID = p.ProductID
INNER JOIN Customers AS c ON od.CustomerID = c.CustomerID;

-- 4.	Tổng số lượng sản phẩm đã bán theo từng loại sản phẩm
-- With CTE (Common Table Expression):
-- Orderdetails : OrderID, CustomerID, (ProductID --> p.Category), Quantity, OrderDate
-- SUM(Quantity) ---> ORDER BY
WITH Orderdetails AS (
	SELECT p.Category, Quantity
	FROM Orders AS o
	INNER JOIN Products AS p ON o.ProductID = p.ProductID
)
SELECT o.Category, SUM(o.Quantity)
FROM Orderdetails AS o
GROUP BY o.Category;

-- Without CTE:
SELECT p.Category, SUM(o.Quantity)
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
GROUP BY p.Category;

-- 5.	Tìm những khách hàng đã đặt nhiều hơn 5 đơn hàng
-- GROUP BY CustomerID, Name
-- COUNT(OrderID)
SELECT o.CustomerID, c.Name, COUNT(o.OrderID) AS OrderCounts
FROM Orders AS o
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
GROUP BY o.CustomerID, c.Name
HAVING COUNT(o.OrderID) > 5;

-- 6.	Tìm tổng doanh thu theo từng sản phẩm
-- Ideas: Orders (OrderID, CustomerID, ProductID --> ProductName, Quantity --> revenue = Quantity*Price, OrderDate) 
-- SUM(Revenue)
-- GROUP BY ProductID, ProductName
SELECT o.ProductID, p.ProductName, SUM(o.Quantity * p.Price) AS Revenue
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
GROUP BY o.ProductID, p.ProductName;

-- 7.	Tìm sản phẩm có doanh thu trên 5 triệu
SELECT o.ProductID, p.ProductName, SUM(o.Quantity * p.Price) AS Revenue
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
GROUP BY o.ProductID, p.ProductName
HAVING SUM(o.Quantity * p.Price) > 5000000
ORDER BY Revenue DESC;

-- 8.	Tìm những đơn hàng được đặt sau ngày 01/01/2025 --> Change to 16/02/2025 for testing
SELECT o.OrderID, o.CustomerID, p.ProductName AS Product
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
WHERE o.OrderDate > '2025-02-16'

-- 9.	Đếm số lượng đơn hàng trong từng ngày
-- Ideas: GROUP BY OrderDate, COUNT(OrderID)
SELECT o.OrderDate, COUNT(o.OrderID) AS OrderCount
FROM Orders AS o
GROUP BY o.OrderDate;

-- 10.	Tìm thành phố có trên 3 khách hàng
-- Ideas: COUNT(o.CustomerID) Distinct --> Make sure Customers are who have made orders
SELECT c.City, COUNT(DISTINCT o.CustomerID)
FROM Orders AS o
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
GROUP BY c.City
HAVING COUNT(DISTINCT o.CustomerID) > 3;

-- 11.	Danh sách đơn hàng kèm theo tên khách hàng và tên sản phẩm
SELECT o.OrderID, o.CustomerID, c.Name AS CustomerName, o.ProductID, p.ProductName AS Product, o.Quantity, o.OrderDate
FROM Orders AS o
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
INNER JOIN Products AS p ON o.ProductID = p.ProductID

-- 12.	Tìm những khách hàng đã mua sản phẩm có giá > 10 triệu
-- Ideas: Orders (OrderID, CustomerID, ProductID --> Price > 10?, Quantity, OrderDate)
SELECT DISTINCT o.CustomerID, c.Name, o.ProductID, p.ProductName, p.Price AS UnitPrice
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
WHERE p.Price > 10000000;

-- 13.	Tổng tiền mỗi khách hàng đã chi tiêu (Quantity * Price)
SELECT c.CustomerID, c.Name, SUM(o.Quantity * p.Price) AS Spendings
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
GROUP BY c.CustomerID, c.Name
ORDER BY c.CustomerID;

-- 14.	Danh sách các thành phố có tổng số tiền mua hàng > 20 triệu
-- Ideas: Orders (OrderID, CustomerID --> City, ProductID, Quantity, OrderDate)
-- GROUP BY City
-- HAVING SUM(o.Quantity * p.Price) > 20000000
SELECT c.City, SUM(o.Quantity * p.Price) AS Spendings
FROM Orders AS o
INNER JOIN Products AS p ON o.ProductID = p.ProductID
INNER JOIN Customers AS c ON o.CustomerID = c.CustomerID
GROUP BY c.City
HAVING SUM(o.Quantity * p.Price) > 20000000;


-- 15.	Tìm những khách hàng chưa từng đặt hàng
-- Ideas: FROM Customers c
-- WHERE c.CustomerID NOT IN o
-- LEFT Table is Customers (big one), RIGHT Table is Orders (small table) --> NULL if not in Customers
SELECT c.CustomerID, c.Name
FROM Customers AS c
LEFT JOIN Orders AS o ON c.CustomerID = o.CustomerID -- NULL if not made order
WHERE o.CustomerID IS NULL

