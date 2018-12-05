CREATE TABLE IF NOT EXISTS `vote_info` (
  `id` BIGINT(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `green_support_num` INT NOT NULL COMMENT '绿营支持数',
  `blue_support_num` INT NOT NULL COMMENT '蓝营支持数',
  `unknown_num` INT NOT NULL COMMENT '未知政治倾向数',
  `neutral_num` INT NOT NULL DEFAULT  0 COMMENT '中立数',
  `region` VARCHAR(64) COMMENT '所属地区',
  `type` VARCHAR(64) COMMENT '模型类别(主题分析、心理分析、网络分析、行为分析、业务专家分析)',
  `community` VARCHAR(64) COMMENT '所属社群',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='投票阵营统计';
