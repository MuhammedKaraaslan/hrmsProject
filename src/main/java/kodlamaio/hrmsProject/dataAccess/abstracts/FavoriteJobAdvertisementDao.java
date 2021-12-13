package kodlamaio.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.concretes.FavoriteJobAdvertisement;


public interface FavoriteJobAdvertisementDao extends JpaRepository<FavoriteJobAdvertisement, Integer>{

	List<FavoriteJobAdvertisement> getByCandidateId(int id);
	
}
