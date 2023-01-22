package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach
{
  FortuneService fortuneService;
  
  public FootballCoach(FortuneService fortuneService)
  {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout()
  {
    return "Practice corner kicks";
  }

  @Override
  public String getDailyFortune()
  {
    return "Football Coach says: " + fortuneService.getFortune();
  }
  
  

}
