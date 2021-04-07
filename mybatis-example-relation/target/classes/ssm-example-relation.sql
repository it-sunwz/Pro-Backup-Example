/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.29 : Database - ssm-exampale-relation
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm-exampale-relation` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm-exampale-relation`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(1) DEFAULT NULL COMMENT '性别',
  `entryTime` datetime DEFAULT NULL COMMENT '入职时间',
  `wage` int(11) DEFAULT NULL COMMENT '薪资',
  `bonus` int(11) DEFAULT NULL COMMENT '奖金',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`name`,`age`,`entryTime`,`wage`,`bonus`) values (1,'巫妖王',1,'1922-10-01 00:00:00',500000,80000),(2,'萨格拉斯',1,'2004-10-12 12:10:00',100000,10000),(3,'基尔加丹',1,'2011-03-17 10:10:00',45000,5000),(4,'拉格纳罗斯',1,'2016-03-28 10:10:00',38000,6000),(5,'泰兰德·语风',1,'2020-09-10 01:12:22',30000,3000),(6,'伊崔格',0,'2020-01-25 01:12:22',28000,5200),(7,'洛坎',1,'2021-07-05 01:12:22',18000,3000),(8,'玛维',1,'2021-07-05 01:12:22',17000,3000);

/*Table structure for table `employee_task` */

DROP TABLE IF EXISTS `employee_task`;

CREATE TABLE `employee_task` (
  `emp_id` int(11) DEFAULT NULL COMMENT '员工外键',
  `task_id` int(11) DEFAULT NULL COMMENT '任务外键',
  KEY `FK_employee_task` (`emp_id`),
  KEY `FK_employee_task11` (`task_id`),
  CONSTRAINT `FK_employee_task11` FOREIGN KEY (`task_id`) REFERENCES `task` (`task_id`),
  CONSTRAINT `FK_employee_task` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee_task` */

insert  into `employee_task`(`emp_id`,`task_id`) values (1,1),(1,2),(1,3),(1,8),(1,7),(2,7),(4,7),(2,8),(3,8),(6,8);

/*Table structure for table `record` */

DROP TABLE IF EXISTS `record`;

CREATE TABLE `record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `record_pos_name` varchar(55) DEFAULT NULL COMMENT '卡机名称',
  `record_time` datetime DEFAULT NULL COMMENT '打卡时间',
  `workcard_id` int(11) NOT NULL COMMENT '工卡外键',
  PRIMARY KEY (`record_id`),
  KEY `FK_record` (`workcard_id`),
  CONSTRAINT `FK_record` FOREIGN KEY (`workcard_id`) REFERENCES `workcard` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `record` */

insert  into `record`(`record_id`,`record_pos_name`,`record_time`,`workcard_id`) values (1,'No1-正门','2021-04-01 07:33:25',1),(2,'No2-侧门','2021-04-01 08:43:25',3),(3,'No1-正门','2021-04-01 17:35:00',1),(4,'No2-侧门','2021-04-01 18:05:03',3),(5,'No1-正门','2021-04-02 06:43:00',1),(6,'No1-正门','2021-04-02 21:15:03',1);

/*Table structure for table `task` */

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `task_name` varchar(500) DEFAULT NULL,
  `task_type` varchar(500) DEFAULT NULL,
  `task_description` varchar(500) DEFAULT NULL,
  `task_public_time` datetime DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `task` */

insert  into `task`(`task_id`,`task_name`,`task_type`,`task_description`,`task_public_time`) values (1,'研发：BUG1101-空指针','研发','修改bug....','2021-04-06 12:00:00'),(2,'制定工作报表','日常','需要详细的研发部门报表','2021-04-06 12:00:00'),(3,'研发：功能新增','研发','增加一个权限控制功能','2021-04-06 12:00:00'),(4,'研发：BUG1102','研发','修改bug','2021-04-06 12:00:00'),(5,'开发ppt模板','日常','研发节日大会ppt，底色为空色','2021-04-06 12:00:00'),(6,'组织党员集体党委会','日常','...','2021-04-06 12:00:00'),(7,'研发：机械自动化处理模块','开发','所有功能','2021-04-06 12:00:00'),(8,'研发：航空FPL报文格式转化','开发','...','2021-04-06 12:00:00');

/*Table structure for table `workcard` */

DROP TABLE IF EXISTS `workcard`;

CREATE TABLE `workcard` (
  `id` int(11) NOT NULL COMMENT '工卡的主键就是员工表的主键做的外键',
  `cw_no` varchar(50) DEFAULT NULL COMMENT '员工编号',
  `cw_attendance` varchar(50) DEFAULT NULL COMMENT '考勤卡机号',
  `cw_entertime` datetime DEFAULT NULL COMMENT '录卡时间',
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_workcard` FOREIGN KEY (`id`) REFERENCES `employee` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `workcard` */

insert  into `workcard`(`id`,`cw_no`,`cw_attendance`,`cw_entertime`) values (1,'S10000001','100001','1922-10-01 00:00:00'),(2,'S10000002','100002','2004-10-12 12:10:00'),(3,'S10000003','100003','2011-03-17 10:10:00'),(7,'S10000004','100004','2021-07-05 01:12:22');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
