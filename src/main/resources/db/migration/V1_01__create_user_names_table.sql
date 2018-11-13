CREATE TABLE `user_names` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `host_reference` VARCHAR(45) NULL,
  `user_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `host_reference_UNIQUE` (`host_reference` ASC) VISIBLE,
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;