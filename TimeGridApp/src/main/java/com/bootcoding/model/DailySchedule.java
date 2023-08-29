package com.bootcoding.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="daily_schedule")
public class DailySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int dayNumber;
    private String title;
    private String description;
    @Column(name = "course_topic")
    private String courseTopic;
    private String category;
    private String active;
    @Column(name = "create_date")
    private Date createDate;
    private String createBy;
    @Column(name = "modified_date")
    private Date modifiedDate;
    private String modifiedBy;

//    @ManyToOne
//    @JoinColumn(name="weekly_id")
//           // nullable=false
//    private WeeklySchedule weeklySchedule;
}
