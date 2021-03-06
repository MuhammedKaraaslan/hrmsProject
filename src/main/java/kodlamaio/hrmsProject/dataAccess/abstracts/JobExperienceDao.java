package kodlamaio.hrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProject.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer>{
	
	JobExperience getById(int id);
	
	List<JobExperience> getAllByOrderByQuitYearDesc(); //Tersten olmalı
	
}
