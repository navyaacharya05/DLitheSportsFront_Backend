package delithe.sports.react.DLitheTournament.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delithe.sports.react.DLitheTournament.repos.AthleteRepository;

@Service
public class AthleteService 
{
	@Autowired
	AthleteRepository arepo;
}
