/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50557
Source Host           : localhost:3306
Source Database       : teachingresource

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2017-11-15 01:19:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_authorization
-- ----------------------------
DROP TABLE IF EXISTS `tb_authorization`;
CREATE TABLE `tb_authorization` (
  `ID` tinyint(6) NOT NULL,
  `authorizationName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_document
-- ----------------------------
DROP TABLE IF EXISTS `tb_document`;
CREATE TABLE `tb_document` (
  `ID` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `upload_by` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `RoleID` tinyint(5) NOT NULL,
  `RoleName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_role_authorization
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_authorization`;
CREATE TABLE `tb_role_authorization` (
  `ID` int(255) NOT NULL,
  `RoleID` tinyint(5) DEFAULT NULL,
  `authorizationID` tinyint(6) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) NOT NULL,
  `user_cretetime` datetime DEFAULT NULL,
  `user_enable` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
