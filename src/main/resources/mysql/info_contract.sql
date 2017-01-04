/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-01-04 17:29:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `info_contract`
-- ----------------------------
DROP TABLE IF EXISTS `info_contract`;
CREATE TABLE `info_contract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rental` int(11) DEFAULT NULL COMMENT '租金',
  `house_id` int(11) DEFAULT NULL COMMENT '房屋编号',
  `contract_temp` int(11) DEFAULT '0' COMMENT '合同模板编号(以后可以扩展)',
  `type_pay` varchar(11) DEFAULT NULL COMMENT '1:支付宝 2：微信 3：现金 4：其它支付方式',
  `description` varchar(255) DEFAULT NULL COMMENT '合同描述',
  `start_time` varchar(255) DEFAULT NULL COMMENT '合同起始时间',
  `end_time` varchar(255) DEFAULT NULL COMMENT '合同终止时间',
  `pledge_pay` float DEFAULT NULL COMMENT '抵押支付',
  `before_pay` float DEFAULT NULL COMMENT '预先支付',
  `rental_type` int(11) DEFAULT '0' COMMENT '1：月租 2：年租',
  `rental_get` varchar(255) DEFAULT NULL COMMENT '催租金时间',
  `rental_space` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_contract
-- ----------------------------
INSERT INTO `info_contract` VALUES ('1', '900', '1', '1', '支付宝支付', '租房合同', '2016-01-06', '2017-03-05', '1', '3', '1', '20', '3');

-- ----------------------------
-- Table structure for `info_house`
-- ----------------------------
DROP TABLE IF EXISTS `info_house`;
CREATE TABLE `info_house` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '房屋编号',
  `house_info` varchar(255) DEFAULT NULL COMMENT '房屋信息',
  `address` varchar(255) DEFAULT NULL COMMENT '地址信息',
  `other_id` int(11) DEFAULT NULL COMMENT '用于扩展用途',
  `own_id` int(10) unsigned zerofill DEFAULT NULL COMMENT '房屋拥有人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_house
-- ----------------------------
INSERT INTO `info_house` VALUES ('1', '房屋信息', '南京市雨花台区', '1', '0000000001');

-- ----------------------------
-- Table structure for `info_state`
-- ----------------------------
DROP TABLE IF EXISTS `info_state`;
CREATE TABLE `info_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contract_id` int(11) DEFAULT '0' COMMENT '合同编号',
  `state_type` varchar(11) DEFAULT '0' COMMENT '1:正常 2：超期 3：失效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_state
-- ----------------------------
INSERT INTO `info_state` VALUES ('1', '1', '正常');

-- ----------------------------
-- Table structure for `info_sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `info_sys_role`;
CREATE TABLE `info_sys_role` (
  `id` int(11) NOT NULL COMMENT '编号',
  `name` varchar(255) DEFAULT NULL COMMENT '登录名称',
  `role` varchar(255) DEFAULT '0' COMMENT '角色',
  `powder` varchar(11) DEFAULT NULL COMMENT '权限',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `sign` varchar(255) DEFAULT NULL COMMENT '加密使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_sys_role
-- ----------------------------
INSERT INTO `info_sys_role` VALUES ('1', 'root', 'root', 'admin', 'root', '加密签名后续功能补齐');

-- ----------------------------
-- Table structure for `info_user`
-- ----------------------------
DROP TABLE IF EXISTS `info_user`;
CREATE TABLE `info_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '用户性别',
  `num_credential` varchar(32) DEFAULT NULL COMMENT '证件号码',
  `role` varchar(11) DEFAULT NULL COMMENT '用户类型 1:租户 2:中间人 3：房东 ',
  `type_credential` varchar(255) DEFAULT NULL COMMENT '证件种类',
  `contract_id` int(11) DEFAULT NULL COMMENT '合同编号（与合同表关联）',
  `house_id` int(11) DEFAULT NULL COMMENT '房屋编号（与房屋表关联）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of info_user
-- ----------------------------
INSERT INTO `info_user` VALUES ('1', '用户甲', '男', '320912189303093329', '租户', '身份证', '1', '1');
INSERT INTO `info_user` VALUES ('2', '用户乙', '女', '320962169603096326', '中间人', '身份证', '1', '1');
INSERT INTO `info_user` VALUES ('3', '用户丙', '女', '320262262203096322', '房东', '身份证', '1', '1');
