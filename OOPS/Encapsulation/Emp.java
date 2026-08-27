
public class Emp{

    private int empId;
    private String empName;
    private String empDept;

    public int setEmpId(int empId){
        this.empId = empId;
        return empId;
    }

    public int getEmpId(){
        return empId;
    }

    public String setEmpName(String empName){
        this.empName = empName;
        return empName;
    }

    public String getEmpName(){
        return empName;
    }

    public String setEmpDept(String empDept){
        this.empDept = empDept;
        return empDept;
    }

    public String getEmpDept(){
        return empDept;
    }
}

