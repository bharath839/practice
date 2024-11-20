package com.praactice.e_comerece.repostory;

import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.entity.TimeStamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface DataBaseOperations  extends  JpaRepository<Categorys,Long> {

    @Query(value = "SELECT * from categorys",nativeQuery = true)
    List<Categorys> findCategoriesWithTimestamp();



}
