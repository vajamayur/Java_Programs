import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Emp emp = new Emp();

        System.out.println("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.println("Enter Employee Name: ");
        String empName = sc.next();

        System.out.println("Enter Employee Department: ");
        String empDept = sc.next();

        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setEmpDept(empDept);

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Department: " + emp.getEmpDept());

        sc.close();
    }
}
