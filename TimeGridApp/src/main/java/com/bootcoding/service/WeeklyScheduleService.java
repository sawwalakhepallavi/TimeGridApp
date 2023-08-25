package com.bootcoding.service;

import com.bootcoding.model.DailySchedule;
import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.repository.WeeklyScheduleRepo;
import com.bootcoding.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeeklyScheduleService {
    @Autowired
    private WeeklyScheduleRepo weeklyScheduleRepo;
    public void insertDataInWeek(WeeklySchedule weeklySchedule){
        weeklyScheduleRepo.save(weeklySchedule);
    }

    public int insertData(int size){
        ArrayList<WeeklySchedule> weeklySchedules=new ArrayList<>();
        int courseId = CourseIdGenerator.courseId();
        for(int i=0;i<size;i++){
            WeeklySchedule weeklySchedule=WeeklySchedule.builder()
                    .courseId(courseId)
                    .weekNumber(i + 1)
                    .title(TitleGenerator.courseTitle())
                    .description(null)
                    .level(LevelGenerator.randomLevel())
                    .difficulty(DifficultyGenerator.randomDifficulty())
                    .courseCategory(null)
                    .active(ActiveGenerator.activityStatus())
                    .build();
            weeklySchedules.add(weeklySchedule);
        }
        weeklyScheduleRepo.saveAll(weeklySchedules);
        return courseId ;
    }

    public List<WeeklySchedule> getAll() {
        return weeklyScheduleRepo.findAll();
    }


//    public void saveData(List<WeeklySchedule> weeklySchedules){
//        weeklyScheduleRepo.saveAll(weeklySchedules);
//    }


}
