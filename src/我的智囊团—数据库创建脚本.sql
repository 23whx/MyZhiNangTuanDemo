/*==============================================================*/
/* DBMS name:      MySQL 4.0                                    */
/* Created on:     2007-6-28 15:25:46                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists answer;

drop table if exists subitem;

drop table if exists item;

drop table if exists question;

drop table if exists user;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   id				  INT		AUTO_INCREMENT PRIMARY KEY ,
   adminid                        VARCHAR(50)                    not null,
   adminpwd                       VARCHAR(50)
) ;

/*==============================================================*/
/* Table: question                                              */
/*==============================================================*/
create table question
(
   qid                            int             auto_increment               not null,
   title                          VARCHAR(50),
   content                        text,
   itemid                         int,
   subid                          int,
   userid                         VARCHAR(50),
   grade                          VARCHAR(50),
   offerscore                     int,
   status                         int,
   questiontime                   datetime,
   clickcount                     int,
   acceptflag                     int,
   commenflag                     int,
   primary key (qid)
) ;

/*==============================================================*/
/* Table: answer                                                */
/*==============================================================*/
create table answer
(
   aid                            int            auto_increment         not null,
   quesans                        VARCHAR(50),
   userid                         VARCHAR(50),
   grade                          VARCHAR(50),
   anstime                        datetime,
   status                         int,
   qid                            int,
   primary key (aid) ,
   foreign key (qid) references question(qid) on delete cascade 
) ;

/*==============================================================*/
/* Table: item                                                  */
/*==============================================================*/
create table item
(
   itemid                         int             auto_increment               not null,
   itemname                       VARCHAR(50),
   itemcode                       int,
   primary key (itemid)
) ;


/*==============================================================*/
/* Table: subitem                                               */
/*==============================================================*/
create table subitem
(
   subid                          int              auto_increment              not null,
   subname                        varchar(50),
   itemid                         int,
   subcode                        int,
   primary key (subid) ,
   foreign key (itemid) references item(itemid) on delete cascade
) ;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id				  INT		AUTO_INCREMENT PRIMARY KEY ,
   userid                         VARCHAR(50)                  not null ,
   userpwd                        VARCHAR(50),
   userques                       VARCHAR(50),
   userans                        VARCHAR(50),
   usermail                       VARCHAR(50),
   integral                       int,
   grade                          int,
   sex                            VARCHAR(2),
   realname                       VARCHAR(50)
) ;

