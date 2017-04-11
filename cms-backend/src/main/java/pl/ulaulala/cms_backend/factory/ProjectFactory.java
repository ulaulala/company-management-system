package pl.ulaulala.cms_backend.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ulaulala.cms_backend.dto.PersonData;
import pl.ulaulala.cms_backend.dto.ProjectData;
import pl.ulaulala.cms_backend.entity.Person;
import pl.ulaulala.cms_backend.entity.Project;

import java.util.List;
import java.util.Set;

@Component
public class ProjectFactory  implements Factory<ProjectData, Project>{

    private PersonFactory personFactory;

    @Autowired
    public ProjectFactory(PersonFactory personFactory) {
        this.personFactory = personFactory;
    }

    public ProjectData create(Project project) {
        if(project == null) {
            return null;
        }

        ProjectData dto = new ProjectData();


        dto.setTitle(project.getTitle());
        dto.setPrincipal(project.getPrincipal());
        dto.setPrice(project.getPrice());
        dto.setStartDate(project.getStartDate());
        dto.setEndDate(project.getEndDate());
        dto.setDescription(project.getDescription());

        //setofpeople

        return dto;
    }

    private void mapPeople(ProjectData projectData, Person person) {

    }
}
