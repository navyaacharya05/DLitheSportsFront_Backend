package delithe.sports.react.DLitheTournament.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delithe.sports.react.DLitheTournament.model.Tournament;
import delithe.sports.react.DLitheTournament.repos.TournamentRepository;

@Service
public class TournamentService 
{
	@Autowired
	TournamentRepository trepo;
	
	//to schedule new tournament
	public String newOne(Tournament tournament) 
	{
		return trepo.save(tournament).getName()+"has added as upcoming event";
	}
	
	//to get list of participants
	public List<Tournament> fetchingAll()
	{
		return trepo.findAll();
	}
	
/*	public List<Object>[] positioning()
	{
		return trepo.findfew();
	}*/
	
	public Tournament fetchingOnlyOne(Integer id)
	{
		return trepo.findById(id).orElse(new Tournament());
	}
	
}
