package com.orbansolutions.api.controller;

import com.orbansolutions.api.model.JobEntry;
import com.orbansolutions.api.repository.JobEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("prod/job-entries")
public class JobEntryController {
    @Autowired
    private JobEntryRepository jobEntryRepository;

    @GetMapping
    public List<JobEntry> getAllJobEntries(){
        return jobEntryRepository.findAll(Sort.by(Sort.Direction.DESC, "targetDate"));
    }
}
