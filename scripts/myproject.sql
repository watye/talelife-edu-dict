/*
 Navicat MySQL Data Transfer

 Source Server         : 23环境
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 172.31.118.23:3306
 Source Schema         : myproject

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 28/01/2019 17:19:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course`  (
  `course_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `parent_course_id` bigint(20) UNSIGNED NOT NULL DEFAULT 0,
  `course_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  `sort` tinyint(4) UNSIGNED NOT NULL DEFAULT 0 COMMENT '序号',
  `expense` smallint(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '费用（分）',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_course_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_course_dict`;
CREATE TABLE `t_course_dict`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `course_id` bigint(20) NOT NULL COMMENT '分类id',
  `dict_id` bigint(20) NOT NULL COMMENT '单词id',
  `sort` smallint(255) UNSIGNED NOT NULL DEFAULT 0 COMMENT '序号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程单词' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_dict
-- ----------------------------
DROP TABLE IF EXISTS `t_dict`;
CREATE TABLE `t_dict`  (
  `dict_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `dict_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单词',
  `usa_pronounce_url` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '美式发音地址',
  `uk_pronounce_url` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '英式发音地址',
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '单词' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
