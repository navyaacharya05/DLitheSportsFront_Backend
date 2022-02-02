package delithe.sports.react.DLitheTournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delithe.sports.react.DLitheTournament.model.Tournament;
import delithe.sports.react.DLitheTournament.repos.TournamentRepository;
@Service
public class TournamentService 
{
	@Autowired
	TournamentRepository trepo;
	
	public String newOne(Tournament tournament) 
	{
		return trepo.save(tournament).getName()+"has added as upcoming event";
	}
}
