package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobCandidate;

public interface JobCandidateDao extends JpaRepository<JobCandidate, Integer> {
	
	JobCandidate findByNationalityId(String nationalityId);
	JobCandidate findByEmail(String email);
	
}
