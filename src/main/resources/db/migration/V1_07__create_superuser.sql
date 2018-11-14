INSERT IGNORE INTO `user_roles` (`name`) VALUES ('ALL');
INSERT IGNORE INTO `authorization_types` (`name`, `description`) VALUES ('SUPERUSER', 'Authorization for everything');
INSERT IGNORE INTO `authorization_type_user_role_permissions` (`authorization_type_id`, `user_role_id`, `permission`) VALUES ('1', '1', 'ANY');
INSERT IGNORE INTO `user_names` (`host_reference`, `user_name`) VALUES (uuid(), 'Superuser');
INSERT IGNORE INTO `authorized_users` (`host_reference`, `salt`, `password`, `user_name`, `authorization_type_name`) VALUES (uuid(), '1234567890', 'SUPERPASSWORD', 'Superuser', 'SUPERUSER');