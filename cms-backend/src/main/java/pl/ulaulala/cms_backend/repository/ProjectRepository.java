package pl.ulaulala.cms_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ulaulala.cms_backend.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
