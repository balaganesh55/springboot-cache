package com.wipro.project.service;

import com.wipro.project.model.Project;
import com.wipro.project.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class ProjectService {
    @Autowired
    private ProjectRepo repo;
    public Project addProject(@RequestBody Project project) {
        return repo.save(project);
    }
    @Cacheable(cacheNames = {"project-cache"})

    public List<Project> getAllProjects() {
        System.out.println("Fetched first time from database");
        return repo.findAll();
    }
    @Cacheable(cacheNames = "project-cache",key="#id",unless="#result==null")
    public Project getProjectById(int id) {
        System.out.println("Fetched first time from database");
        return repo.findById(id).orElse(null);
    }

    public List<Project> addProjects(List<Project> projects) {
        return repo.saveAll(projects);
    }
}
