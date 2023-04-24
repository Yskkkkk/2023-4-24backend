CREATE TABLE `store` (
                         `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
                         `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '店名',
                         `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '地址',
                         `size` decimal(24,2) DEFAULT NULL COMMENT '面积',
                         `pre_divisor_value` decimal(24,2) DEFAULT NULL COMMENT '开店前准备除数的权值',
                         `free_population_num` int DEFAULT NULL COMMENT '店空闲时需要的人数',
                         `aft_divisor_value` decimal(24,2) DEFAULT NULL COMMENT '关店后准备除数的权值',
                         `aft_add_value` int DEFAULT NULL COMMENT '关店后准备加数的权值',
                         `pre_prepare_hour_num` int DEFAULT NULL COMMENT '开店之前需要做几小时准备工作',
                         `aft_prepare_hour_num` int DEFAULT NULL COMMENT '关门之后需要做几小时准备工作',
                         `pass_flow_divisor_value` decimal(24,2) DEFAULT NULL COMMENT '人流量对应店员数的除数权值',
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='店铺表';