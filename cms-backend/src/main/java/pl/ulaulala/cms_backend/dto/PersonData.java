package pl.ulaulala.cms_backend.dto;

import java.util.Date;
import java.util.Set;

public class PersonData {

    private Integer id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private AddressData address;
    private Set<ProjectData> projects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public AddressData getAddress() {
        return address;
    }

    public void setAddress(AddressData address) {
        this.address = address;
    }

    public Set<ProjectData> getProjects() {
        return projects;
    }

    public void setProjects(Set<ProjectData> projects) {
        this.projects = projects;
    }
}
