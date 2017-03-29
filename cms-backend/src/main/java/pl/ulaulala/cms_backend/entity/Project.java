package pl.ulaulala.cms_backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Project {

    @Id
    @Column(name = "project_id")
    private Integer id;
    private String title;
    private String principal;
    private Integer price;
    private Date startProject;
    private Date endProject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getStartProject() {
        return startProject;
    }

    public void setStartProject(Date startProject) {
        this.startProject = startProject;
    }

    public Date getEndProject() {
        return endProject;
    }

    public void setEndProject(Date endProject) {
        this.endProject = endProject;
    }
}
