package com.faith.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.demo.dao.IRanking;
import com.faith.demo.dto.RankStudentDto;
import com.faith.demo.entity.Ranking;

@Service
public class RankingService implements IRankingService {
	
	@Autowired
	private IRanking rankingRepo;

	@Override
	public List<Ranking> getRankings() {
		
		return (List<Ranking>) rankingRepo.findAll() ;
	}

	@Override
	public void saveRanking(Ranking ranking) {
		rankingRepo.save(ranking);
		
	}

	@Override
	public Optional<Ranking> getRanking(int id) {
		
		return rankingRepo.findById(id);
	}

	@Override
	public void deleteRanking(int id) {
		rankingRepo.deleteById(id);
		
	}

	@Override
	public List<Ranking> getRankingsByCourseName(String name) {
		
		return (List<Ranking>)rankingRepo.findByCourseName(name);
	}

	//@Override
	//public List<RankStudentDto> geAllDTORankings() {
		
		//return (List<RankStudentDto>) rankingRepo.geAllDTORankings();
	//}




	

}
