# springsecurity
[Configuration]
![image](https://user-images.githubusercontent.com/76067750/158090625-b44c33ae-1999-4902-9308-cf10fc332d26.png)
[application.properties]
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.password=1234
spring.datasource.username=root
spring.datasource.url=jdbc:mysql://localhost:3306/security?serverTimezone=UTC
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.jpa.properties.hibernate.format_sql=true
server.error.include-message=always
[Create controller package]
![img.png](img.png)
Using Mustache engine for view. 
mustache default folder is src/main/resources/
TO render .html against Mustache engine, create Config as below
![img_4.png](img_4.png)

[After running]
Recognized the created encoded password
![img_2.png](img_2.png)

open browser and will see the login page.
![img_3.png](img_3.png)