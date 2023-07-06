package com.orbansolutions.api.repository;

import com.orbansolutions.api.model.JobEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobEntryRepository extends MongoRepository<JobEntry, String> {
}
