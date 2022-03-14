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

[Create more functons inside IndexController.java]
![img_6.png](img_6.png)

Once you check all url request, you will get all response.
That is not the right approach. Need to add url security.
To do so, crete SecurityConfig class inside cofig package.
![img_7.png](img_7.png)

![img_8.png](img_8.png)

Create Login Page 
![img_9.png](img_9.png)

For login, need to create user model.
![img_10.png](img_10.png)
After running, User table is being created in security DB.

![img_11.png](img_11.png)

Modified Three files and create Html Files for User register.
![img_12.png](img_12.png)

To store encrypted password, create the below method inside securityConfig
@Bean
public BCryptPasswordEncoder encoderPwd(){
return new BCryptPasswordEncoder();
}

To autowire BcrpytPasswordEncoder in IndexController to encrypt user password,
need to add anotation @Bean for IOC.

[Login]<br>
SpringSecurity Login Process <br>
1. Log in on HTML
2. Grab loginPrcessingURL inside SecurityConfig
3. Check information inside of principalDetailService
4. Create UserDetails 
5. Create Principal
6. Internally, Authentication got UserDetails
7. Internally, Session got Authentication
<br><br>
[TO login as Manager or Admin]<br>
8.Create Manager and Admin Account <br>
Update roles for Manager and Admin
![img_13.png](img_13.png)

Manager login<br>
![img_14.png](img_14.png)
Can access /user <br>
![img_15.png](img_15.png)
Can Access /manager <br>
![img_16.png](img_16.png)
Can not access /admin <br>
![img_17.png](img_17.png)

[Once you want to secure only one method ]<br>

![img_18.png](img_18.png)

[How to use the above annotation]
![img_19.png](img_19.png)






