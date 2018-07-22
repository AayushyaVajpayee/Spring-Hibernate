# A sample Spring-Hibernate application without any xml configuration using a gradle build

Usually any spring application which includes hibernate as an ORM includes lot of plumbing configuration in form of xml.
In this application all configuration has been done in java files along with proper annotations.

## What this application does?
An entity class `com.sample.spring.entity.User` has been created which stores all the users in database table(users).
Two methods of `com.sample.spring.dao.UserDaoUserService` class are as following:
```java
void add(User user) // adds a new user row in USERS table of database
List<User> listUsers() // fetches all the rows present in USERS table of database
```
## how to run the application?
Configure the properties in `/src/main/resources/db.properties` according to your settings of mysql.
After that from the home directory of the project you need to execute the following two commands in command prompt (if you don't have gradle configured follow this link [gradle installation](https://gradle.org/install/#manually))
```text
gradle build
gradle run
```



## Built With

* [Sping-core](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html) - The framework used
* [Hibernate](http://hibernate.org/orm/documentation/5.3/) - The ORM used
* [Gradle](https://docs.gradle.org/4.9/userguide/userguide.html) - Dependency Management
* [MySql](https://dev.mysql.com/doc/refman/8.0/en/) - Database used
