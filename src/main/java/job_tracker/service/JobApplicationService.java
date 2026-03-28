package job_tracker.service;

import job_tracker.model.JobApplication;
import job_tracker.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public JobApplication addJobApplication(JobApplication jobApplication){
        return jobApplicationRepository.save(jobApplication);
    }

    public List<JobApplication> getApplicationsByUserId(Long userId){
        return jobApplicationRepository.findByUserId(userId);
    }

    public List<JobApplication> getApplicationsByStatus(String status){
        return jobApplicationRepository.findByStatus(status);
    }

    public JobApplication updateJobApplication(JobApplication jobApplication){
        return jobApplicationRepository.save(jobApplication);
    }

    public void deleteJobApplication(Long id){
        jobApplicationRepository.deleteById(id);
    }

}
