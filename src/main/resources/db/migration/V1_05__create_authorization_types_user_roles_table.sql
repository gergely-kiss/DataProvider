CREATE TABLE `authorization_types_user_roles` (
  `authorization_type_id` INT NOT NULL,
  `user_role_id` INT NULL,
  PRIMARY KEY (`authorization_type_id`),
  INDEX `id_idx` (`user_role_id` ASC) VISIBLE,
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