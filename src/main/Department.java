package main;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

//@Table
@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(targetEntity = Employee.class)
    private Set employeeSet;

    public Set getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Department() {
    }

    public Department(String name, Set employeeSet) {

        this.name = name;
        this.employeeSet = employeeSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
