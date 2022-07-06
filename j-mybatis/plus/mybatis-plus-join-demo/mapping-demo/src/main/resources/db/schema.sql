DROP TABLE IF EXISTS `user`;

create table `user`
(
    `id`       int auto_increment
        primary key,
    `parent_id`      int not null,
    `name`     varchar(255) not null,
    `sex`      int      not null,
    `head_img` varchar(255) not null,
    `del` bit not null
);

DROP TABLE IF EXISTS user_address;

create table user_address
(
    id      int auto_increment
        primary key,
    user_id int          null,
    tel     varchar(255) null,
    address varchar(255) null,
    del bit not null
);