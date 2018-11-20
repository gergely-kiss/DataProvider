CREATE TABLE `authorization_type_user_role_permissions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_role_id` INT NOT NULL,
  `authorization_type_id` INT NOT NULL,
  `permission` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `authorization_type_id_idx` (`authorization_type_id` ASC) VISIBLE,
  CONSTRAINT `user_role_id`
    FOREIGN KEY (`user_role_id`)
    REFERENCES `user_roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `authorization_type_id`
    FOREIGN KEY (`authorization_type_id`)
    REFERENCES `user_roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
