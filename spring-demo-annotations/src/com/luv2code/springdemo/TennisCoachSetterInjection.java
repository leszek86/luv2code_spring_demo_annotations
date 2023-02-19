package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachSetterInjection implements Coach
{
  @Autowired
  FortuneService fortuneService;
  
  // define default constructor
  public TennisCoachSetterInjection()
  {
    System.out.println("TennisCoachSetterInjection: inside default instructor");
  }

  @Override
  public String getDailyWorkout()
  {
    return "Practice backhand";
  }

  @Override
  public String getDailyFortune()
  {
    return fortuneService.getFortune();
  }

}
