package main;

import jakarta.persistence.*;

import java.util.Set;

//@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double salary;
    @ManyToMany(targetEntity = Department.class)
    private Set departmentSet;

    public Set getDepartmentSet() {
        return departmentSet;
    }

    public void setDepartmentSet(Set departmentSet) {
        this.departmentSet = departmentSet;
    }

    public Employee() {
    }

    public Employee(String name, double salary, Set departmentSet) {

        this.name = name;
        this.salary = salary;
        this.departmentSet = departmentSet;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
