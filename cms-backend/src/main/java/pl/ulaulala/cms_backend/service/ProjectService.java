package pl.ulaulala.cms_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ulaulala.cms_backend.dto.ProjectData;
import pl.ulaulala.cms_backend.entity.Project;
import pl.ulaulala.cms_backend.factory.ProjectFactory;
import pl.ulaulala.cms_backend.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;
    private ProjectFactory projectFactory;

    @Autowired
    public ProjectService(ProjectRepository projectRepository, ProjectFactory projectFactory) {
        this.projectRepository = projectRepository;
        this.projectFactory = projectFactory;
    }

    public List<ProjectData> findAll() {
        List<Project> projects = projectRepository.findAll();
        return projectFactory.createList(projects);
    }

    public List<ProjectData> findAllWith() {
        List<Project> projects = projectRepository.findAll();
        return projectFactory.createListWith(projects);
    }

    public ProjectData findOne(int id) {
        Project project = projectRepository.findOne(id);
        return projectFactory.createWithPeople(project);
    }
}
