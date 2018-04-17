CREATE TABLE `personalworkbench`.`record` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `userID` VARCHAR(45) NOT NULL,
  `IP` VARCHAR(45) NOT NULL,
  `counting` VARCHAR(45) NULL,
  `status` VARCHAR(45) NOT NULL,
  `loginTimed` VARCHAR(45) NULL,
  `workBenchAlter` VARCHAR(45) NULL,
  `other` VARCHAR(45) NULL,
  `other1` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `userID_UNIQUE` (`userID` ASC),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;
