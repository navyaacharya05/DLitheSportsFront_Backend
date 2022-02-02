package delithe.sports.react.DLitheTournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delithe.sports.react.DLitheTournament.repos.TournamentRepository;
@Service
public class TournamentService 
{
	@Autowired
	TournamentRepository repo;
}
