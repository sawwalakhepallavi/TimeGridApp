package com.bootcoding.controller;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.service.DailyScheduleService;
import com.bootcoding.service.WeeklyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TimeGrid")
public class DailyController {
    @Autowired
    private DailyScheduleService dailyScheduleService;



    @PostMapping("/Daily-Schedule/{week}/{size}")
    public String insertData(@PathVariable("week") int id,@PathVariable int size){
        dailyScheduleService.insertData(id,size);
        return "successfully";
    }

    @GetMapping("/getAll")
    public List<DailySchedule> getAll(){
        return dailyScheduleService.getAll();
    }
    @PostMapping("/dailyschedule")
    public DailySchedule insertData(@RequestBody DailySchedule dailySchedule)
    {
        return dailyScheduleService.save(dailySchedule);
    }


}
