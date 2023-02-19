package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachFieldInjection implements Coach
{
  FortuneService fortuneService;
  
  // define default constructor
  public TennisCoachFieldInjection()
  {
    System.out.println("TennisCoachSetterInjection: inside default instructor");
  }
  
  /*
  @Autowired
  public TennisCoachSetterInjection(FortuneService fortuneService)
  {
    this.fortuneService = fortuneService;
  }
  */
  
  // define a setter method
  @Autowired
  public void setFortuneService(FortuneService theFortuneService)
  {
    System.out.println("TennisCoachSetterInjection: inside setFortuneService method");
    fortuneService = theFortuneService;
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
