package com.wipro.project.controller;

import com.wipro.project.model.Project;
import com.wipro.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectinfo")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("/addproject")
    public Project addProject(Project project) {
        return projectService.addProject(project);
    }
    @PostMapping("/addprojects")
    public List<Project> addProjects(@RequestBody List<Project> projects) {
        return projectService.addProjects(projects);
    }
    @GetMapping("/getallprojects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
    @GetMapping("/getprojectbyid/{id}")
    public Project getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

}
