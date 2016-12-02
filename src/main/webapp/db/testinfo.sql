/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-12-02 17:27:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for testinfo
-- ----------------------------
DROP TABLE IF EXISTS `testinfo`;
CREATE TABLE `testinfo` (
  `id` varchar(32) NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `sex` int(10) NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testinfo
-- ----------------------------
INSERT INTO `testinfo` VALUES ('96899012715610112', 'admin', '1');
INSERT INTO `testinfo` VALUES ('96899012715610113', 'admin', '1');
SET FOREIGN_KEY_CHECKS=1;
