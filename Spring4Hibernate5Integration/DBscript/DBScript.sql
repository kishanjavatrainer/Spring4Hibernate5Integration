CREATE TABLE `employee_table` (
  `employee_id` int(11) NOT NULL,
  `email` varchar(255) default NULL,
  `employee_name` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `salary` double default NULL,
  PRIMARY KEY  (`employee_id`)
);
