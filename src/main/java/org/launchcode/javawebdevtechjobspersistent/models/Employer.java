package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min=3, max=100)
    private String location;

    @OneToMany
    @JoinColumn (name= "employer_id")
    private List<Job> jobs = new ArrayList<>();

    //constructors

    public Employer(@NotNull @Size(min = 3, max = 100) String location, List<Job> jobs) {
        this.location = location;
        this.jobs = jobs;
    }

    public Employer() {}


    //getters and setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}