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
	
	public String newOne(Tournament tournament)
	{
		return trepo.save(tournament).getName()+" has added as upcoming event";
	}
	
	public List<Tournament> fetchingAll()
	{
		return trepo.findAll();
	}
	
//	public List<Object[]> positioning()
//	{
//		return trepo.findFew();
//	}
	
	//To declare participants
	public Tournament fetchingOnlyOne(Integer id)
	{
		return trepo.findById(id).orElse(new Tournament());
	}
	
	public String announce(Tournament tournament)
	{
		return trepo.save(tournament).getName()+"has updated";
	}
	
}
