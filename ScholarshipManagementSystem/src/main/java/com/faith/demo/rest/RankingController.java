package com.faith.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.demo.dto.RankStudentDto;
import com.faith.demo.entity.Ranking;
import com.faith.demo.service.IRankingService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RankingController {
	
	@Autowired
	private IRankingService rankingService;
	
	//get all rankings
	@GetMapping("/rankings")
	public List <Ranking> getAllCourse(){
		return rankingService.getRankings();
		
	}
	
	//get ranking by id
	@GetMapping("/rankings/{id}")
	public Optional<Ranking> getRanking(@PathVariable int id){
		return rankingService.getRanking(id);
		
	}
	
	//Add  ranking
	@PostMapping("/rankings")
	public void addRanking(@RequestBody Ranking ranking) {
		rankingService.saveRanking(ranking);
	}
	
	//update employee
	
	@PutMapping("/rankings")
	public void updateRanking(@RequestBody Ranking ranking) {
		rankingService.saveRanking(ranking);
	}
	
	//delete ranking
	@DeleteMapping("/rankings/{id}")
	public void deleteRanking(@PathVariable int id) {
		rankingService.deleteRanking(id);
	}
	
	public List<Ranking> getAllCourseByName(String name){
		return rankingService.getRankingsByCourseName(name);
		
	}

	//@GetMapping("/rankings/dto")
	//public List <RankStudentDto> geAllDTORankings(){
		//return rankingService.geAllDTORankings();
		
	//}
	
}
