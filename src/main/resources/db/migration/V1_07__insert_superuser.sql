INSERT IGNORE INTO `user_roles` (`name`, `description`) VALUES ('SUPERUSER', 'Role for ultimate acces');
INSERT IGNORE INTO `authorization_types` (`name`, `description`) VALUES ('SUPERUSER', 'Authorization for everything');
INSERT IGNORE INTO `authorization_types_user_roles` (`authorization_type_id`, `user_role_id`) VALUES ('1', '1');
INSERT IGNORE INTO `user_names` (`host_reference`, `user_name`) VALUES (uuid(), 'Superuser');
INSERT IGNORE INTO `authorized_users` (`host_reference`, `salt`, `password`, `user_name`, `authorization_type_name`) VALUES (uuid(), '1234567890', 'SUPERPASSWORD', 'Superuser', 'SUPERUSER');