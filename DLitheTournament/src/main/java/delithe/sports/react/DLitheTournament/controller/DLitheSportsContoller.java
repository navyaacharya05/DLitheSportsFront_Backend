package delithe.sports.react.DLitheTournament.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import delithe.sports.react.DLitheTournament.model.Tournament;
import delithe.sports.react.DLitheTournament.services.AthleteService;
import delithe.sports.react.DLitheTournament.services.TournamentService;

@RestController
public class DLitheSportsContoller 
{
	@Autowired
	TournamentService tservice;
	@Autowired
	AthleteService aservice;
	
	@PostMapping("/add")
	public String addingTour(@RequestBody Tournament tournament)
	{
		return tservice.newOne(tournament);
	}
}
