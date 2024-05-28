/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80300
 Source Host           : localhost:3306
 Source Schema         : weblab

 Target Server Type    : MySQL
 Target Server Version : 80300
 File Encoding         : 65001

 Date: 09/05/2024 03:37:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE,
  UNIQUE INDEX `email`(`email`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin1', 'admin', '2142259202@qq.com', '2003-10-22');
INSERT INTO `admin` VALUES (2, 'admin2', 'admin', '1', '2024-05-09');
INSERT INTO `admin` VALUES (3, 'admin3', 'admin', '12', '2024-05-09');
INSERT INTO `admin` VALUES (4, 'admin4', 'admin', '123', '2024-05-09');
INSERT INTO `admin` VALUES (5, 'admin5', 'admin', '1234', '2024-05-09');
INSERT INTO `admin` VALUES (6, 'admin6', 'admin', '12345', '2024-05-09');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` datetime(0) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `postal_code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '2016-05-03 08:00:00', '王小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (2, '2016-05-03 08:00:00', '张小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (3, '2016-05-03 08:00:00', '刘小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (4, '2016-05-03 08:00:00', '李小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (5, '2016-05-03 08:00:00', '赵小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (6, '2016-05-03 08:00:00', '史小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');
INSERT INTO `user` VALUES (7, '2016-05-03 08:00:00', '朱小虎', '上海', '普陀区', '上海市普陀区金沙江路 1518 弄', '200333');

SET FOREIGN_KEY_CHECKS = 1;
