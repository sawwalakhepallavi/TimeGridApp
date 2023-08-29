package com.bootcoding.controller;

import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.service.WeeklyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @PostMapping("/week_schedule")
    public String generateWeeklySchedule(@RequestParam("value") int value, @RequestParam("courseId") int id)
    {
        weeklyScheduleService.save(value, id);
        return "true" ;
    }


    @GetMapping("/getAll")
    public List<WeeklySchedule> getAll(){
        return weeklyScheduleService.getAll();
    }

    @GetMapping("/getByID/{id}")
    public Optional<WeeklySchedule> getById(@PathVariable int id){
            return weeklyScheduleService.getById(id);
    }

    @DeleteMapping("/deleteby/{id}")
    public String deleteById(@PathVariable int id){
         weeklyScheduleService.deleteById(id);
         return "delete Successfully";
    }

    @PutMapping("/update/{id}")
    public Optional<WeeklySchedule> updateById(@PathVariable int id,@RequestBody WeeklySchedule weeklySchedule){
        return weeklyScheduleService.updateById(id,weeklySchedule);
    }

//    @PostMapping("/WeeklyByOneToOne")
//    public String saveData(@RequestBody List<WeeklySchedule> weeklySchedules){
//        weeklyScheduleService.saveData(weeklySchedules);
//        return "data inserted";
//    }



    @PostMapping("/saveByPostman")
    public String saveByPostman(@RequestBody WeeklySchedule weeklySchedule){
         weeklyScheduleService.saveByPostman(weeklySchedule);
         return "enter successfully";
    }


}
