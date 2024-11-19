package com.praactice.e_comerece.repostory;

import com.praactice.e_comerece.entity.Categorys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataBaseOperations  extends  JpaRepository<Categorys,Long> {

}
