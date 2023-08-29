package com.bootcoding.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="weekly_schedule")
public class WeeklySchedule{
    @Id
    @GeneratedValue
    private int id;
    private int courseId;
    @Column(name = "week_number")
    private int weekNumber;
    private String title;
    private String description;
    private int level;
    private String difficulty;
    private String courseCategory;
    private String active;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "modified_date")
    private Date modifiedDate;
    @Column(name = "modified_by")
    private String modifiedBy;
    @OneToMany(mappedBy = "weeklySchedule")
    private List<DailySchedule> dailyScheduleList=new ArrayList<>();

}
