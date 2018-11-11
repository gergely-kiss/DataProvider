CREATE TABLE IF NOT EXISTS USERS(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  host_reference varchar(100) NOT NULL,
  username varchar(100),
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT IGNORE INTO `users` 
(`host_reference`, `username`) VALUES (uuid(), 'superuser');