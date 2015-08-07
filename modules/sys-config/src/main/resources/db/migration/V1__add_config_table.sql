/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : pms1

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-07-24 18:32:13
*/
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(128) DEFAULT NULL COMMENT '菜单KEY值',
  `value` varchar(128) DEFAULT NULL COMMENT 'value',
  `type` varchar(100) DEFAULT NULL COMMENT '菜单的响应动作类型',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `url` varchar(256) DEFAULT NULL COMMENT '网页链接，用户点击菜单可打开链接',
  `media_id` varchar(50) DEFAULT NULL COMMENT '调用新增永久素材接口返回的合法media_id',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父节点',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='配置信息';

