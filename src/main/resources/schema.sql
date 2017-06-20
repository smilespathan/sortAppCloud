CREATE TABLE IF NOT EXISTS `test`.`sorted_array_info` (
  `ID` INT NOT NULL  AUTO_INCREMENT,
  `random_numbers` varchar(255) NULL,
  `sorted_Numbers` varchar(255) NULL,
  `no_Of_Swap_Operations` INT NULL DEFAULT 0,
  `processing_mili_seconds` INT NULL DEFAULT 0,
  `created_Date` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`));