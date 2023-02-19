package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp
{
  public static void main(String[] args)
  {
 // read spring config java class
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
    
    // get bean from spring container
    Coach theCoach = context.getBean("tennisCoachFieldInjection", Coach.class);
    
    // call a method on the bean
   System.out.println(theCoach.getDailyWorkout());
   
   // call a method on the bean
   System.out.println(theCoach.getDailyFortune());
   
   // close context
   context.close();
  }
  
  
}
