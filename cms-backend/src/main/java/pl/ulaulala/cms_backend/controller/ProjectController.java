package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.dto.ProjectData;
import pl.ulaulala.cms_backend.entity.Project;
import pl.ulaulala.cms_backend.factory.ProjectFactory;
import pl.ulaulala.cms_backend.repository.ProjectRepository;
import pl.ulaulala.cms_backend.service.ProjectService;

import java.util.List;

@RestController
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List<ProjectData> findAllProjects() {
        return projectService.findAll();
    }
}
