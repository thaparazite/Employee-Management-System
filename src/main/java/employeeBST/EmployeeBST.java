package employeeBST;

import employee.Employee;
import employee_BST_interface.EmployeeBSTInterface;

public class EmployeeBST implements EmployeeBSTInterface {

    private class Node {
        Employee data;// declare a variable to store the employee data
        Node left, right;// declare variables to store the left and right child nodes

        // Node constructor
        public Node(Employee data) {
            this.data = data;// assign the data to the node
            this.left = this.right = null;// initialize the left and right child nodes to null
        }// end of Node constructor
    }// end of Node class

    private Node root;

    public void insert(Employee data) {
        root = insertRec(root, data);
    }// end of insert method

    // recursive method to insert a new employee record
    private Node insertRec(Node root, Employee data) {
        // if the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);// create a new node and pass the data to it
            return root;// return the root node
        } // end of if statement

        /*
         * if the data to be inserted is less than the root data, then it will be
         * inserted in the left subtree of the root node otherwise it will be inserted
         * in the right subtree of the root node
         */
        if (data.compareTo(root.data) < 0)
            root.left = insertRec(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);
        return root;// return the root node
    }// end of insertRec method

    public Employee search(int employeeId) {
        return searchRecord(root, employeeId);
    }// end of search method

    /*
     * recursive method to search for a node in the tree with the given employee ID
     */
    private Employee searchRecord(Node root, int employeeId) {
        // if the tree is empty or the root node is the node to be searched, return the
        if (root == null || root.data.getEmployeeID() == employeeId)
            return (root != null) ? root.data : null;// return the root node if it is not null

        /*
         * if the employee ID to be searched is less than the root employee ID,
         * recursively search in the left subtree of the root node
         */
        if (employeeId < root.data.getEmployeeID())
            return searchRecord(root.left, employeeId);
        /*
         * recursively search in the right subtree of the root node if the employee ID
         */
        return searchRecord(root.right, employeeId);
    }// end of searchRec method

    public void delete(int employeeId) {
        root = deleteRecord(root, employeeId);// call the deleteRecord method to delete the record
    }// end of delete method

    // recursive method to delete a node from the tree with the given employee ID
    private Node deleteRecord(Node root, int employeeId) {
        // if the tree is empty return null
        if (root == null)
            return root;
        // recursively search for the node to be deleted in the left subtree of the root
        if (employeeId < root.data.getEmployeeID()) {
            root.left = deleteRecord(root.left, employeeId);
            // recursively search for the node to be deleted in the right subtree of the
            // root
        } else if (employeeId > root.data.getEmployeeID()) {
            root.right = deleteRecord(root.right, employeeId);
            // if the node to be deleted is the root node with only one child or no child
        } else {
            if (root.left == null) {
                return root.right;// return the right child of the root node
            } else if (root.right == null) {
                return root.left;// return the left child of the root node
            } // end of if-else statement

            // if the node to be deleted has two children get the in order successor
            root.data = minValueNode(root.right).data;
            // delete the in order successor
            root.right = deleteRecord(root.right, root.data.getEmployeeID());
        } // end of else statement
        return root;// return the root node
    }// end of deleteRecord method

    /*
     * method to find the node with the minimum value in the tree
     */
    private Node minValueNode(Node root) {
        Node current = root;// create a new node and assign the root node to it
        while (current.left != null)// loop through the left subtree of the current node
            current = current.left;// assign the left subtree of the current node to the current node
        return current; // return the current node
    }// end of minValueNode method

    @Override
    public void printRecords() {
        inOrderTraversal(root);// call the inOrderTraversal method to print the records
    }// end printRecords

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println("Employee ID: " + root.data.getEmployeeID() + ", Name: " + root.data.getName()
                    + ", Department: " + root.data.getDepartment());
            inOrderTraversal(root.right);
        } // end if statement
    }// end inOrderTraversal method

}// end EmployeeBST class
