package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachConstructorInjection implements Coach
{
  FortuneService fortuneService;
  
  @Autowired
  public TennisCoachConstructorInjection(FortuneService fortuneService)
  {
    this.fortuneService = fortuneService;
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
