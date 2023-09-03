package com.bootcoding.service;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.repository.DailyScheduleRepo;
import com.bootcoding.util.ActiveGenerator;
import com.bootcoding.util.DateGenerator;
import com.bootcoding.util.TitleGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DailyScheduleService {
    @Autowired
    private DailyScheduleRepo dailyScheduleRepo;

    @Autowired
    private WeeklyScheduleService weeklyScheduleService;
    public List<DailySchedule> insertData(int size){
        ArrayList<DailySchedule> dailySchedules=new ArrayList<>();
//        Optional<WeeklySchedule> weeklyData=weeklyScheduleService.getById(id);
        for(int i=0;i<size;i++){
            DailySchedule dailySchedule=DailySchedule.builder()
                    .dayNumber(i+1)
                    .title(TitleGenerator.courseTitle())
                    .description("basics of java")
                    .courseTopic("java")
                    .category("easy")
                    .active(ActiveGenerator.activityStatus())
                    .createDate(DateGenerator.createDate())
                    .createBy("Bootcoding")
                    .modifiedDate(DateGenerator.modifiedDate())
                    .modifiedBy("Aman")
//                    .weeklySchedule(weeklyData.get())
                    .build();
            dailySchedules.add(dailySchedule);
        }
//        dailyScheduleRepo.saveAll(dailySchedules);

        return dailyScheduleRepo.saveAll(dailySchedules);
    }

    public List<DailySchedule> getAll() {
        return dailyScheduleRepo.findAll();
    }

    public DailySchedule save(DailySchedule dailySchedule) {
       return dailyScheduleRepo.save(dailySchedule);
    }
}
