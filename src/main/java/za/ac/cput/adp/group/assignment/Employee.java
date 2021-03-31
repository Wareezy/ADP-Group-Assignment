/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp.group.assignment;

/**
 *
 * @author warren Jaftha-219005303
 */
public class Employee {
    private String role, employeename,surname;
    
    public String getRole()
    {
        return role;
    }
    public void setRole(String role)
    {
        this.role= role;
    }
    public String getEmployeename()
    {
        return employeename;
    }
    public void setEmployeename(String employeename)
    {
        this.employeename= employeename;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String surname)
    {
        this.surname=surname;
    }
    @Override
    public String toString()
    {
        return "Employee{" + "id=" + role+ ", Employeename=" + employeename + ", surname="  + surname + "}" ; 
    }
    
}
