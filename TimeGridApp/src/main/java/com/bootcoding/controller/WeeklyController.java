package com.bootcoding.controller;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.service.DailyScheduleService;
import com.bootcoding.service.WeeklyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class WeeklyController {


    @Autowired
    private WeeklyScheduleService weeklyScheduleService;


    @PostMapping("/Weekly-Schedule")
    public String insertDateInWeek(@RequestBody WeeklySchedule weeklySchedule){
        weeklyScheduleService.insertDataInWeek(weeklySchedule);
        return "Data insert successfully";
    }

    @PostMapping("/Weekly-Schedules/{size}")
    public String insertData(@PathVariable int size){
        int courseId = weeklyScheduleService.insertData(size);
        return "Data insert successfully for course id = " + courseId;
    }
    @GetMapping("/getAll")
    public List<WeeklySchedule> getAll(){
        return weeklyScheduleService.getAll();
    }

//    @PostMapping("/WeeklyByOneToOne")
//    public String saveData(@RequestBody List<WeeklySchedule> weeklySchedules){
//        weeklyScheduleService.saveData(weeklySchedules);
//        return "data inserted";
//    }


}
