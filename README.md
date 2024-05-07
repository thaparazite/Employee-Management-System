# Employee-BST

## Project Overview:
The Employee Binary Search Tree (BST) project implements a binary search tree data structure tailored for managing employee records. It includes functionalities to insert, search, and delete employee records efficiently using the BST operations. The program provides a command-line interface (CLI) for users to interact with the BST and perform operations such as inserting new records, searching for records by employee ID, deleting records, and printing all employee records.

## Implementation Details:
### EmployeeBST Class:
- **Description:** Implements the binary search tree for managing employee records.
- **Features:**
  - Insertion: Inserts a new employee record into the BST.
  - Search: Searches for an employee record by employee ID.
  - Deletion: Deletes an employee record from the BST.
  - Printing: Prints all employee records in sorted order of employee IDs.
- **Inner Node Class:**
  - Description: Represents a node in the binary search tree.
  - Features:
    - Contains employee data and references to left and right child nodes.

### App Class:
- **Description:** Provides a CLI for users to interact with the EmployeeBST.
- **Features:**
  - Menu: Displays a menu with options to insert, search, delete, print records, and exit.
  - User Input: Reads user input to perform the selected operation.
  - Error Handling: Validates user input and handles invalid input gracefully.
  - Continuation: Prompts the user to continue or exit after completing an operation.

### EmployeeBSTInterface:
- **Description:** Defines the interface for interacting with the EmployeeBST.
- **Methods:**
  - Insert: Inserts a new employee record.
  - Search: Searches for an employee record by employee ID.
  - Delete: Deletes an employee record by employee ID.
  - Print Records: Prints all employee records in sorted order.

### Employee Class:
- **Description:** Represents an employee entity with attributes such as employee ID, name, and department.
- **Features:**
  - Comparable: Implements the `Comparable` interface to enable sorting based on employee ID.
  - Getters: Provides getter methods for accessing employee attributes.

## Getting Started:
### Prerequisites:
Ensure that Java Development Kit (JDK) is installed on your system.

#### Installation Steps:
|**Step**|**Description**|
|----|-----------|
| 1  | Clone the repository to your local machine.|
| 2  | Compile the Java files using `javac` command or your preferred IDE.|
| 3  | Execute the `App` class to run the Employee Management System.|
| 4  | Follow the on-screen prompts to insert, search, delete, or print employee records.|

## Support and Assistance:
If you encounter any issues or have questions about the project, feel free to open an issue on GitHub or reach out to the project maintainer via email x22195092@student.ncirl.ie.

## Project Maintenance and Contributors:
This project is maintained and contributed to by [Flaviu Vanca](https://github.com/thaparazite). Contributions are welcome via pull requests, and all contributors are encouraged to follow the project's contribution guidelines outlined in the CONTRIBUTING.md file.

## License:
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

## Disclaimer:
This project is for educational and informational purposes only. It is not intended for commercial use or deployment in critical environments without proper validation and testing. Use at your own risk.
