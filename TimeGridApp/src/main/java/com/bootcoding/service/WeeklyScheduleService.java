package com.bootcoding.service;

import com.bootcoding.model.WeeklySchedule;
import com.bootcoding.repository.WeeklyScheduleRepo;
import com.bootcoding.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<WeeklySchedule> save(int value,int courseId) {
        List <WeeklySchedule>list=new ArrayList<>();
        for (int i = 0; i < value; i++) {
            WeeklySchedule weeklySchedule = WeeklySchedule.builder()
                    .courseId(courseId)
                    .weekNumber(i+1)
                    .title(TitleGenerator.courseTitle())
                    .description("The Java Programming Fundamentals course ")
                    .level(LevelGenerator.randomLevel())
                    .difficulty(DifficultyGenerator.randomDifficulty())
                    .courseCategory("Programming")
                    .active(ActiveGenerator.activityStatus())
                    .createDate(DateGenerator.createDate())
//                    .createBY("bootcoding")
                    .modifiedDate(DateGenerator.modifiedDate())
                    .modifiedBy("mohan")
                    .build();
            list.add(weeklySchedule);
        }
        weeklyScheduleRepo.saveAll(list);
        return list;
    }

    public List<WeeklySchedule> getAll() {
        return weeklyScheduleRepo.findAll();
    }

    public Optional<WeeklySchedule> getById(int id) {
        return weeklyScheduleRepo.findById(id);
    }

    public void deleteById(int id) {
        weeklyScheduleRepo.deleteById(id);
    }

    public Optional<WeeklySchedule> updateById(int id, WeeklySchedule weeklySchedule) {
       Optional<WeeklySchedule> weekId= weeklyScheduleRepo.findById(id);
       if(weekId!=null){
           weeklyScheduleRepo.save(weeklySchedule);
       }
        return weekId;

    }


//    public void saveData(List<WeeklySchedule> weeklySchedules){
//        weeklyScheduleRepo.saveAll(weeklySchedules);
//    }

    public void saveByPostman(WeeklySchedule weeklySchedule){
        weeklyScheduleRepo.save(weeklySchedule);
    }

}
