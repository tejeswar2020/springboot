create database `spring_boot` DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;
  USE spring_boot;
CREATE TABLE IF NOT EXISTS users (username VARCHAR(255) NOT NULL PRIMARY KEY, password VARCHAR(255) NOT NULL, role VARCHAR(255) NOT NULL);


CREATE TABLE `userprofile` (
  `username` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `maritialStatus` varchar(45) NOT NULL,
  `cellPhoneNumber` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  CONSTRAINT `username` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
