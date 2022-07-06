DROP TABLE IF EXISTS area;

create table area
(
    id       int auto_increment
        primary key,
    province varchar(255) null,
    city     varchar(255) null,
    area     varchar(255) null,
    postcode varchar(255) null,
    del bit
);

DROP TABLE IF EXISTS `user`;

create table `user`
(
    id       int auto_increment
        primary key,
    name     varchar(255) not null,
    sex      tinyint      not null,
    head_img varchar(255) not null,
    del bit
);

DROP TABLE IF EXISTS user_address;

create table user_address
(
    id      int auto_increment
        primary key,
    user_id int          null,
    area_id int          null,
    tel     varchar(255) null,
    address varchar(255) null,
    del bit
);