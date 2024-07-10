package com.wipro.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name="project")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
    @Id
    @GeneratedValue
    public int id;
    public String projectname;
    public String projectdesc;
    public String projectstatus;
    public String projectmanager;
    public String projectclient;
    public String projectstartdate;
    public String projecttendate;
    public String projectcost;
    public int projectmembers;
    //public List<String> projectmembernames;
    public String projectmanagermail;
    public String projectlinks;
    public String projectreviewdate;
}
