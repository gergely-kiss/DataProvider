CREATE TABLE `users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `host_reference` VARCHAR(45) NULL,
  `first_name` VARCHAR(100) NULL,
  `last_name` VARCHAR(100) NULL,
  `email_address` VARCHAR(100) NULL,
  `user_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `host_reference_UNIQUE` (`host_reference` ASC) VISIBLE,
  INDEX `user_name_idx` (`user_name` ASC) VISIBLE,
  CONSTRAINT `user_name`
    FOREIGN KEY (`user_name`)
    REFERENCES `user_names` (`user_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;