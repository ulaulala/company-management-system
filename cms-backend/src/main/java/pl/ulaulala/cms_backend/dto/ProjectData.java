package pl.ulaulala.cms_backend.dto;

import pl.ulaulala.cms_backend.entity.Person;

import java.util.Date;
import java.util.Set;

public class ProjectData {

    private Integer id;
    private String title;
    private String principal;
    private Integer price;
    private Date startDate;
    private Date endDate;
    private String description;
    private Set<PersonData> people;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<PersonData> getPeople() {
        return people;
    }

    public void setPeople(Set<PersonData> people) {
        this.people = people;
    }
}
