package pl.ulaulala.cms_backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contract {

    @Id
    @Column(name = "contract_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String jobTitle;
    private Integer salary;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Contract contract;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}






