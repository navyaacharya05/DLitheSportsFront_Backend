package delithe.sports.react.DLitheTournament.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delithe.sports.react.DLitheTournament.model.Athlete;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Integer>
{

}
