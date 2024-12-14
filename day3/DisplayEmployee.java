package day3;

import java.util.*;

class NEmployee {    
    String eName;
    int empNo;
    String empDepartment;
    
    public NEmployee(String Name, int no, String Department) {
        eName = Name;
        empNo = no;
        empDepartment = Department;
    }
    
    public void display() {
        System.out.println("EmpNo : " + empNo + ", Emp Name: " + eName + ", Department: " + empDepartment);
    }
    
    public int getId() {
        return empNo;
    }
}

public class DisplayEmployee {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        NEmployee[] e = new NEmployee[6]; // creating array of class objects

        for (int i = 0; i < e.length; i++) {    
            System.out.print("Enter the Name of Employee " + (i + 1) + ": ");
            String name = in.next();
            System.out.print("Enter the Employee no.: ");
            int no = in.nextInt();
            System.out.print("Enter Employee Department: ");
            String department = in.next();
            
            e[i] = new NEmployee(name, no, department); 
            // filling info in each employee
        }
        // calling sorting function
        sorting(e);
        
        // displaying the records
        for (int i = 0; i < e.length; i++) {
            e[i].display();
        }

        in.close();
    }

    public static void sorting(NEmployee[] employees) {  
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getId() > employees[j + 1].getId()) {
                    // Swapping
                    NEmployee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}



