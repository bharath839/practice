package com.praactice.e_comerece.repostory;

import com.praactice.e_comerece.entity.TimeStamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimeRepo extends JpaRepository<TimeStamp ,Long> {
    @Query(value = "SELECT * from time_stamp",nativeQuery = true)
    List<TimeStamp> findTimeStamp();
}
