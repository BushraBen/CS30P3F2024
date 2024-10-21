package MasteryUEmployeeFacultyStaff;

public class Faculty 
extends UEmployee 
{
    private String departmentName;

    public Faculty(String name, double salary, String departmentName) 
    {
        super(name, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() 
    {
        return departmentName;
    }
}