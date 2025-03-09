package com.footballleague.league_organizer.controllers;

import com.footballleague.league_organizer.entities.Goal;
import com.footballleague.league_organizer.services.GoalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/goals")
public class GoalController{
    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }
    @GetMapping
    public List<Goal> getAllGoals(){
        return goalService.getAllGoals();
    }
}
