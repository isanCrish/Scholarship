package com.faith.demo.service;

import java.util.List;
import java.util.Optional;

import com.faith.demo.dto.RankStudentDto;
import com.faith.demo.entity.Ranking;



public interface IRankingService {
	
	//list
	public List<Ranking>getRankings();
	
	//insert
	public void saveRanking(Ranking ranking);
	
	//select by id
	 public Optional<Ranking>getRanking(int id);
	 
	 //Delete
	   public void deleteRanking(int id);
	   
	   //Find By EmployeeName--Custom Methods
	   public List<Ranking> getRankingsByCourseName(String name);
	   
	   //listing rank
	 //  public List<RankStudentDto> geAllDTORankings();

}
