INSERT IGNORE INTO `authorization_types` (`name`) VALUES ('ALL');
INSERT IGNORE INTO `user_roles` (`name`, `description`) VALUES ('SUPERUSER', 'Role for superuser');
INSERT IGNORE INTO `authorization_type_user_role_permissions` (`authorization_type_id`, `user_role_id`, `permission`) VALUES ('1', '1', 'ANY');
INSERT IGNORE INTO `user_names` (`user_name`) VALUES ('Superuser');
INSERT IGNORE INTO `authorized_users` (`host_reference`, `salt`, `password`, `user_name`, `user_role_name`) VALUES ('1234567890_Superuser', '1234567890', 'SUPERPASSWORD', 'Superuser', 'SUPERUSER');