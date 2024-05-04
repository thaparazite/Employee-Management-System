package employee_BST_interface;

import employee.Employee;

public interface EmployeeBSTInterface {
    void insert(Employee employee);// insert a new node in the tree with the given employee data

    Employee search(int employeeID);// search for a node in the tree with the given employee ID

    void delete(int employeeID);// delete a node from the tree with the given employee ID

    void printRecords();// print the tree in order of employee ID
}// end BST interface
