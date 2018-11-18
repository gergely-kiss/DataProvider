CREATE TABLE `authorization_type_user_role_permissions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `authorization_type_id` INT NOT NULL,
  `user_role_id` INT NOT NULL,
  `permission` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `user_role_id_idx` (`user_role_id` ASC) VISIBLE,
  CONSTRAINT `authorization_type_id`
    FOREIGN KEY (`authorization_type_id`)
    REFERENCES `authorization_types` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `user_role_id`
    FOREIGN KEY (`user_role_id`)
    REFERENCES `user_roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
