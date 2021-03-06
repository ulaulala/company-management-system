package pl.ulaulala.cms_backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.dto.ProjectData;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.entity.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectFactory  implements Factory<ProjectData, Project>{

    private PersonFactory personFactory;

    @Autowired
    public ProjectFactory(@Lazy PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

    public ProjectData create(Project project) {
        if(project == null) {
            return null;
        }

        ProjectData dto = new ProjectData();

        dto.setId(project.getId());
        dto.setTitle(project.getTitle());
        dto.setPrincipal(project.getPrincipal());
        dto.setPrice(project.getPrice());
        dto.setStartDate(project.getStartDate());
        dto.setEndDate(project.getEndDate());
        dto.setDescription(project.getDescription());

        return dto;
    }

    public ProjectData createWith(Project project) {
        if(project == null) {
            return null;
        }

        ProjectData dto = new ProjectData();

        dto.setId(project.getId());
        dto.setTitle(project.getTitle());
        dto.setPrincipal(project.getPrincipal());
        dto.setPrice(project.getPrice());
        dto.setStartDate(project.getStartDate());
        dto.setEndDate(project.getEndDate());
        dto.setDescription(project.getDescription());
        mapPeople(dto, new ArrayList<Person>(project.getPeople()));

        return dto;
    }

    private void mapPeople(ProjectData projectData, List<Person> people) {
        List<PersonData> personData = personFactory.createList(people);
        projectData.setPeople(new HashSet<PersonData>(personData));
    }

    public List<ProjectData> createListWith(List<Project> entities) {
        return entities.stream()
                .map(this::createWith)
                .collect(Collectors.toList());
    }
}
