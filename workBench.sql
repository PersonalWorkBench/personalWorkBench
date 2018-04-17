CREATE TABLE `personalworkbench`.`workbench` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `userID` VARCHAR(45) NOT NULL,
  `workBenchID` VARCHAR(45) NOT NULL,
  `workBenchName` VARCHAR(45) NOT NULL,
  `taxNumber` VARCHAR(45) NOT NULL,
  `introduction` VARCHAR(3000) NOT NULL,
  `workBenchAuthory` VARCHAR(5) CHARACTER SET 'ucs2' NOT NULL,
  `image1` VARCHAR(45) NOT NULL,
  `iamge2` VARCHAR(45) NOT NULL,
  `iamge3` VARCHAR(45) NOT NULL,
  `iamge4` VARCHAR(45) NOT NULL,
  `iamge5` VARCHAR(45) NOT NULL,
  `other` VARCHAR(45) NULL,
  `other1` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC),
  UNIQUE INDEX `userID_UNIQUE` (`userID` ASC),
  UNIQUE INDEX `workBenchID_UNIQUE` (`workBenchID` ASC),
  UNIQUE INDEX `workBenchName_UNIQUE` (`workBenchName` ASC),
  UNIQUE INDEX `taxNumber_UNIQUE` (`taxNumber` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;
