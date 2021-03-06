CREATE TABLE `authorized_users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `host_reference` VARCHAR(45) NULL,
  `salt` VARCHAR(45) NULL,
  `password` VARCHAR(100) NULL,
  `user_name` VARCHAR(45) NULL,
  `user_role_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `user_name_idx` (`user_name` ASC) VISIBLE,
  INDEX `user_role_fk_idx` (`user_role_name` ASC) VISIBLE,
  CONSTRAINT `user_name_fk`
    FOREIGN KEY (`user_name`)
    REFERENCES `user_names` (`user_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `name_fk`
    FOREIGN KEY (`user_role_name`)
    REFERENCES `user_roles` (`name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;