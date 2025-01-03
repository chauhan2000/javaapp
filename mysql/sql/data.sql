-- Users(ID: Long, Userame: String, Email: String, Password: String)
-- Products(ID: Long, Name: String, Price: String, Description: String, ImageLink: String, Display: String, Ram: String, Memory: String)
--Create 3 User
INSERT INTO Users (ID, Username, Email, Password) VALUES (0, 'admin', 'admin', 'admin');
INSERT INTO Users (ID, Username, Email, Password) VALUES (1, 'user1', 'user1', 'user1');
INSERT INTO Users (ID, Username, Email, Password) VALUES (2, 'user2', 'user2', 'user2');
--Create 3 Product Smartphone, Iphone 7, Iphone 8 Iphone X
INSERT INTO Products (ID, Name, Price, Description, Image_Link, Display, Ram, Memory) VALUES (0, 'Iphone 14', '1000000', 'Iphone 14', 'https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/p/h/photo_2022-09-28_21-58-51.jpg', '5.5 inch', '4GB', '64GB');
INSERT INTO Products (ID, Name, Price, Description, Image_Link, Display, Ram, Memory) VALUES (1, 'Iphone 7', '2000000', 'Iphone 7', 'https://cdn.didongviet.vn/pub/media/catalog/product//i/p/iphone-7-vang-didongviet.jpg', '5.5 inch', '4GB', '64GB');
INSERT INTO Products (ID, Name, Price, Description, Image_Link, Display, Ram, Memory) VALUES (2, 'Iphone 8', '3000000', 'Iphone 8', 'https://cdn.tgdd.vn/Products/Images/42/114113/iphone-8-64gb-1-7-org.jpg', '5.5 inch', '4GB', '64GB');

