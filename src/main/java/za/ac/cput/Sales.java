/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author Ameer Ismail
 * 218216033
 */
public class Sales 
{
    
    private String beds, mirrors, doors;

    public String getBeds() {
        return beds;
    }

    public String getMirrors() {
        return mirrors;
    }

    public String getDoors() {
        return doors;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public void setMirrors(String mirrors) {
        this.mirrors = mirrors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Sales{" + "beds=" + beds + ", mirrors=" + mirrors + ", doors=" + doors + '}';
    }
    
    
    
}