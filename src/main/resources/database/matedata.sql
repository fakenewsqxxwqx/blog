CREATE DATABASE IF NOT EXISTS blog_db;

create table blog_db.blog (
                              id int not null auto_increment,
                              title varchar(255) not null,
                              content text not null,
                              createTime DATETIME not null,
                              updateTime DATETIME not null,
                              del tinyint(1) not null default 0,
                              primary key (id)
);


create table blog_db.user (
                              id int not null auto_increment,
                              username varchar(255) not null,
                              password varchar(255) not null,
                              email varchar(255) not null,
                              isAdmin tinyint(1) not null default 0,
                              createTime DATETIME not null,
                              updateTime DATETIME not null,
                              del tinyint(1) not null default 0,
                              primary key (id)
);

create table blog_db.comment (
                                 id int not null auto_increment,
                                 blogId int not null,
                                 userId int not null,
                                 content text not null,
                                 createTime DATETIME not null,
                                 del tinyint(1) not null default 0,
                                 primary key (id)
);

create table blog_db.tag (
                             id int not null auto_increment,
                             name varchar(255) not null,
                             blogId int not null,
                             del tinyint(1) not null default 0,
                             primary key (id)
);

INSERT into blog_db.user values (1, 'admin', '123456', 'yy17633796552@outlook.com', 1, now(), now(), 0);
