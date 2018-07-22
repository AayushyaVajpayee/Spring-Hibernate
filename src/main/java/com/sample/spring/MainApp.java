package com.sample.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.spring.config.AppConfig;
import com.sample.spring.entity.User;
import com.sample.spring.service.UserService;

public class MainApp {
   public static void main(String[] args){
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("ravi", "singh", "ravi.singh@example.com"));
      userService.add(new User("David", "Miller", "david.miller@example.com"));
      userService.add(new User("Paul", "Smith", "paul.smith@example.com"));

      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      context.close();
   }
}
