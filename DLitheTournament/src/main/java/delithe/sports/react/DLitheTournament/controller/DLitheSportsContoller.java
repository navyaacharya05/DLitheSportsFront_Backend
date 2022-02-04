package delithe.sports.react.DLitheTournament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import delithe.sports.react.DLitheTournament.model.Tournament;
import delithe.sports.react.DLitheTournament.services.AthleteService;
import delithe.sports.react.DLitheTournament.services.TournamentService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class DLitheSportsContoller 
{
	@Autowired
	TournamentService tservice;
	@Autowired
	AthleteService aservice;
	
	@GetMapping("/")
	public List<Tournament> readingMore()
	{
		return tservice.fetchingAll();
	}
	
	@PostMapping("/add")
	public String addingTour(@RequestBody Tournament tournament)
	{
		return tservice.newOne(tournament);
	}
}
