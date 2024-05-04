package employee;

public class Employee implements Comparable<Employee> {
    // declare variables to store the employee ID, name, and department
    private int employeeID;
    private String name;
    private String department;

    // Employee constructor to initialize the employee ID, name, and department
    public Employee(int employeeID, String name, String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
    }// end Employee constructor

    public int getEmployeeID() {
        return this.employeeID;
    }// end getEmployeeID

    public String getName() {
        return this.name;
    }// end getEmployeeName

    public String getDepartment() {
        return this.department;
    }// end getEmployeeDepartment

    @Override
    public int compareTo(Employee o) {
        /*
         * compare the employee ID of the current employee with the employee ID of the
         * employee passed as an argument
         */
        return Integer.compare(this.employeeID, o.employeeID);
    }// end compareTo method

}// end Employee class
