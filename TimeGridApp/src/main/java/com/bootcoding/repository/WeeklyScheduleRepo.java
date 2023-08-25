package com.bootcoding.repository;

import com.bootcoding.model.WeeklySchedule;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyScheduleRepo extends JpaRepository<WeeklySchedule, Integer>{
}
