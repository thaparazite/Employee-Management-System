package employee_management_system;

import java.util.Scanner;

import employee.Employee;
import employeeBST.EmployeeBST;
import employee_BST_interface.EmployeeBSTInterface;

public class App {
    public static void main(String[] args) {
        EmployeeBSTInterface employee = new EmployeeBST(); // Using polymorphism to refer to the interface

        // Insert sample employee records
        employee.insert(new Employee(1234, "John Doe", "Development"));
        employee.insert(new Employee(5678, "Jane Smith", "HR"));
        employee.insert(new Employee(9012, "Alice Johnson", "Sales"));
        employee.insert(new Employee(3456, "Bob Brown", "Marketing"));
        employee.insert(new Employee(7890, "Karen Davis", "Finance"));
        employee.insert(new Employee(2345, "Tom Wilson", "Development"));

        System.out.println("\n");
        App.divider();// call the divider method to print a line
        System.out.println("               *** Employee Management System *** ");
        App.divider();// call the divider method to print a line
        boolean exit = false;// declare and initialize the exit variable to false
        while (!exit) {

            App.printMenu();// call the printMenu method to print the menu
            App.divider();// call the divider method to print a line

            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            while (choice < 1 || choice > 5) {
                System.out.print(" Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    App.divider(); // call the divider method to print a line
                    if (choice < 1 || choice > 5) {
                        System.out.println(" Invalid choice. Please enter a number between 1 and 5.");
                        App.divider(); // call the divider method to print a line
                    } // end of if statement
                } else {
                    App.divider(); // call the divider method to print a line
                    System.out.println(" Invalid input. Please enter an integer.");
                    App.divider(); // call the divider method to print a line
                    scanner.next(); // consume the invalid input
                } // end of if-else statement
            } // end of while loop

            // switch statement to perform the operation based on the user's choice
            switch (choice) {
                case 1:
                    String title = " Insert an employee record";
                    App.printUnderline(title);// call the printTitleUnderline method to print the title
                    System.out.print(" Enter employee ID: ");
                    int employeeID = scanner.nextInt();
                    System.out.print(" Enter employee name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print(" Enter employee department: ");
                    String department = scanner.nextLine();
                    System.out.println(" --------------------------");
                    employee.insert(new Employee(employeeID, name, department));
                    System.out.println(" Employee record inserted.");
                    break;
                case 2:
                    title = " Search for an employee record";
                    App.printUnderline(title);// call the printTitleUnderline method to print the title
                    String text = " Enter employee ID to search: ";
                    System.out.print(text);
                    int searchID = scanner.nextInt();
                    Employee searchEmployee = employee.search(searchID);
                    if (searchEmployee != null) {
                        App.printUnderline(text);
                        System.out.println(" Employee with ID: " + searchEmployee.getEmployeeID()
                                + " was found in the "
                                + searchEmployee.getDepartment() + " department"
                                + " and the name is: " + searchEmployee.getName());

                    } else {
                        System.out.println(" Employee not found.");

                    } // end of if-else statement
                    break;
                case 3:
                    title = " Delete an employee record";
                    App.printUnderline(title);// call the printTitleUnderline method to print the title
                    System.out.print(" Enter employee ID to delete: ");
                    int deleteID = scanner.nextInt();
                    employee.delete(deleteID);
                    System.out.println(" ------------------------------");
                    System.out.println(" Employee with ID " + deleteID + " deleted.");
                    break;
                case 4:

                    title = " Print all employee records";
                    App.printUnderline(title);// call the printTitleUnderline method to print the title
                    employee.printRecords();
                    break;
                case 5:
                    exit = true;
                    break;

            }// end of switch statement
            while (true) {
                App.divider(); // call the divider method to print a line
                System.out.print(" Continue (yes/no)? : ");
                String continueChoice = scanner.next();
                App.divider(); // call the divider method to print a line
                if (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("no")) {
                    if (continueChoice.equalsIgnoreCase("no")) {
                        exit = true;
                        scanner.close();
                    } // end of if statement
                    break;
                } else {
                    System.out.println(" Invalid choice. Please enter yes or no.");
                } // end of if-else statement
            } // end of while loop
        } // end of while loop

        System.out.println("                      *** God Bye *** ");
        App.divider();// call the divider method to print a line
    }// end of main method

    private static void printMenu() {
        System.out.println(" 1. Insert an employee record");
        System.out.println(" 2. Search for an employee record");
        System.out.println(" 3. Delete an employee record");
        System.out.println(" 4. Print all employee records");
        System.out.println(" 5. Exit");
    }// end of printMenu method

    private static void divider() {
        System.out.println("----------------------------------------------------------------");
    }// end of divider method

    private static void printUnderline(String text) {
        System.out.println(text);
        String underline = " ";
        for (int i = 0; i < text.length() - 1; i++) {
            underline += "-";
        } // end of for loop
        System.out.println(underline);
    }// end of printTitleUnderline method
}// end of App class
