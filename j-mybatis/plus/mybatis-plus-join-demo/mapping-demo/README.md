## 演示表结构

user表

|column|type|说明|
|---|---|---|
|id|int|主键|
|pid|int|上级id|
|name|varchar|名称|
|sex|tinyint|性别|
|head_img|varchar|头像|

user_address表

|column|type|说明|
|---|---|---|
|id|int|主键|
|user_id|int|用户id|
|tel|varchar|电话|
|address|varchar|地址|

[数据库DDL](https://gitee.com/best_handsome/mybatis-plus-join-demo/blob/master/mapping-demo/src/main/resources/db/schema.sql)

[数据库数据记录](https://gitee.com/best_handsome/mybatis-plus-join-demo/blob/master/mapping-demo/src/main/resources/db/data.sql)