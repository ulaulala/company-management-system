package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.entity.Project;
import pl.ulaulala.cms_backend.repository.ProjectRepository;

import java.util.List;

@RestController("/project")
public class ProjectController {

    private ProjectRepository projectRepository;

    @Autowired
    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping("/project")
    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }
}
