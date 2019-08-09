CREATE TABLE `emp_basic` (
  `employee_id` bigint(20) NOT NULL,
  `employee_email` varchar(255) DEFAULT NULL,
  `employee_first_name` varchar(255) DEFAULT NULL,
  `employee_gender` varchar(255) DEFAULT NULL,
  `employee_last_name` varchar(255) DEFAULT NULL,
  `employee_middle_name` varchar(255) DEFAULT NULL,
  `employee_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `emp_advanced` (
  `employee_address` varchar(255) DEFAULT NULL,
  `employee_mal` varchar(255) DEFAULT NULL,
  `employee_primary_skill` varchar(255) DEFAULT NULL,
  `employee_proficiency` varchar(255) DEFAULT NULL,
  `employee_id` bigint(20) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `leaves` (
  `leave_id` bigint(20) NOT NULL,
  `leave_description` varchar(255) DEFAULT NULL,
  `leave_shortname` varchar(255) DEFAULT NULL,
  `level_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`leave_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `emp_leaves` (
  `id` bigint(20) NOT NULL,
  `leave_date` varchar(255) DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `leaveid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc2xqcjcnm1vajj1785j482t8x` (`employee_id`),
  KEY `FKbwwq1kqg1vk14qu0iggqcy75q` (`leaveid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `project` (
  `project_id` varchar(50) NOT NULL,
  `project_short_name` varchar(255) DEFAULT NULL,
  `project_description` varchar(255) DEFAULT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `forecast` (
  `forecast_id` bigint(20) NOT NULL,
  `forecast_end` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`forecast_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `career_level` (
  `level_id` bigint(20) NOT NULL,
  `level` varchar(255) DEFAULT NULL,
  `level_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`level_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `emp_project_association` (
  `id` bigint(20) NOT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `project_id` bigint(20) DEFAULT NULL,
  `workstream_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8308qr16h9mj9c6nasmguufjs` (`employee_id`),
  KEY `FKn2pq8abtgktwddqvixhf7jvv8` (`project_id`),
  KEY `FKjq9n32qa8vin5h1e732jvwkmd` (`workstream_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `emp_work_hrs_allocation` (
  `id` bigint(20) NOT NULL,
  `hours` varchar(255) DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `workstream_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa6f77dfvd7fw47jti2a3ijd1q` (`employee_id`),
  KEY `FKrwndqwpttdlgrlfy64gts56le` (`workstream_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `forecast_allocation` (
  `id` bigint(20) NOT NULL,
  `hour_allocation` varchar(255) DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `forecast_id` bigint(20) DEFAULT NULL,
  `workstream_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKf3jmhogfblgisfwc4lm3e5n8c` (`employee_id`),
  KEY `FKl9uxs59mpht11hs6774d3368j` (`forecast_id`),
  KEY `FKc6oxvg93of1405y6wgm8o50qy` (`workstream_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `work_streams` (
  `workstream_id` varchar(50) NOT NULL,
  `workstream_name` varchar(255) DEFAULT NULL,
  `workstream_parent_id` varchar(255) DEFAULT NULL,
  `project_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`workstream_id`),
  KEY `FK62ry5rplgjpc9pm80w5nddpjq` (`project_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
