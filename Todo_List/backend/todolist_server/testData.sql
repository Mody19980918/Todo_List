CREATE DATABASE `todolist`

USE `todolist`

CREATE TABLE `todolist_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(50) COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=343 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='USER TABLE';


insert into `todolist_user` (`username`, `email`,`password`) VALUES('testing1', 'testing123@123.com', 'test123!');
insert into `todolist_user` (`username`, `email`,`password`) VALUES('testing2', 'testing456@123.com', 'test123!');
insert into `todolist_user` (`username`, `email`,`password`) VALUES('testing3', 'testing789@123.com', 'test123!');