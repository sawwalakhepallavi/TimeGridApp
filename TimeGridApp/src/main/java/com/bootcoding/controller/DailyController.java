package com.bootcoding.controller;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.service.DailyScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TimeGrid")
public class DailyController {
    @Autowired
    private DailyScheduleService dailyScheduleService;

    @PostMapping("/Daily-Schedule")
    public String insertData(@RequestBody DailySchedule dailySchedule){
        dailyScheduleService.insertData(dailySchedule);
        return "successfully";
    }

}
