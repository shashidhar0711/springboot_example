package com.mercedesbenz.reifenlabel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mercedesbenz.reifenlabel.model.Tyrelabelentries;
@Repository
public interface TierLabelEntryRepo extends JpaRepository<Tyrelabelentries, Integer> {
	 
	  @Query(value= "select * from Tyrelabelentries where plant =:plantid or modelseries =:model ",nativeQuery=true) 
	  public List<Tyrelabelentries> getTyrelabelentries(@Param("plantid") String plant,@Param("model") String model );
}
