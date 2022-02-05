package delithe.sports.react.DLitheTournament.repos;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import delithe.sports.react.DLitheTournament.model.Tournament;

/*array:index>>0to N
 * list:index>> 0 t0 size
 * map: position(user defined one)>>eg:150-downey,200- evans,80-scarlet
 * 
 * save
 * findAll
 * findById(json)/ getById(xml)
 * delete
 */

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer>
{
	//Hibernate Query Language
	//@Query("Select tournamentId,name from Tournament")
	//public List<Object>[] findfew();
	
}
