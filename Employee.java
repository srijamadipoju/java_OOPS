import java.util.*;
class Employee1
{
    String name;
    float salary;
    String role;
    String email;
    int id;

    public Employee1(String name,float salary,String role,String email,int id)
    {
        this.name=name;
        this.salary=salary;
        this.role=role;
        this.email=email;
        this.id=id;
    }
    public void displayDetails()
    {
        System.out.println("Name is : " + this.name);
        System.out.println("Salary is : " + this.salary);
        System.out.println("Role is : " + this.role);
        System.out.println("Email is : " + this.email);
        System.out.println("Id is : " +this.id);
        System.out.println("------------------------------");
        
    }

}
class Employee
{
    public static void main(String args[])
    {
        Employee1 e1 = new Employee1("Srija",100000,"Software developer","Srijamadipoju09@gmail.com",489);
        Employee1 e2 = new Employee1("Sandhya",175000,"Software Tester","Sandhyamadipoju11@gmail.com",470);
        Employee1 e3 = new Employee1("Ramesh",155000,"Software programmer","Rameshmadipoju55@gmail.com",464);
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

