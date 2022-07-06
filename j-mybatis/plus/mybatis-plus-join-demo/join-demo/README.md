### 演示表结构

user表

|column|type|说明|
|---|---|---|
|id|int|主键|
|name|varchar|名称|
|sex|tinyint|性别|
|head_img|varchar|头像|

user_address表

|column|type|说明|
|---|---|---|
|id|int|主键|
|user_id|int|用户id|
|area_id|int|区域id|
|tel|varchar|电话|
|address|varchar|地址|

area表

|column|type|说明|
|---|---|---|
|id|int|主键|
|province|varchar|省|
|city|varchar|市|
|area|varchar|区|
|postcode|varchar|邮编|

[数据库DDL](https://gitee.com/best_handsome/mybatis-plus-join-demo/blob/master/join-demo/src/main/resources/db/schema.sql)

[数据库数据记录](https://gitee.com/best_handsome/mybatis-plus-join-demo/blob/master/join-demo/src/main/resources/db/data.sql)