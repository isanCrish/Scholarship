package com.faith.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.demo.dto.RankStudentDto;
import com.faith.demo.entity.Ranking;

@Repository
public interface IRanking extends CrudRepository<Ranking, Integer> {
	
	 //Custom Methods - JPQL
		@Query ("from Ranking where courseName like %?1%")
		public List <Ranking> findByCourseName (String name);
		
		
		//@Query("SELECT new com.faith.demo.dto.RankStudentDto(r.applicationCode, r.studentId,s.studentName, "
			//      + "r.courseName, r.average,r.credits, r.ranks,r.approvedDate)"
			  //    + "FROM Ranking r INNER JOIN r.student s ORDER BY r.applicationCode")	
		//public List<RankStudentDto> geAllDTORankings();

}


