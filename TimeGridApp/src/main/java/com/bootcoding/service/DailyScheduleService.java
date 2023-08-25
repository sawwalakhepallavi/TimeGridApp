package com.bootcoding.service;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.repository.DailyScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyScheduleService {
    @Autowired
    private DailyScheduleRepo dailyScheduleRepo;
    public void insertData(DailySchedule dailySchedule){
        dailyScheduleRepo.save(dailySchedule);

    }
}
