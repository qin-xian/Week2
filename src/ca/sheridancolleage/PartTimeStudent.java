/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancolleage;

/**
 *
 * @author Enzo
 */
public class PartTimeStudent extends Student{
    private int hoursOfStudy;
    public PartTimeStudent(String givenName, String givenID){
            super(givenName, givenID);
    }
    /**
     * @return the hoursOfStudy
     */
    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    /**
     * @param hoursOfStudy the hoursOfStudy to set
     */
    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
    
}
