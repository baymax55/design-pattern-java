package main.designpattern.compositepattern;


import java.util.ArrayList;
import java.util.List;

/**
 * @author bx
 * @date 8/7/2019 9:26 AM
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee : [ Name :" + name + ", dept :" + dept + ", salary :" + salary + " ]");
    }
}
