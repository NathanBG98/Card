/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Nathan BG
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;
    
    public PartTimeStudent (String studentId, String studentName, String numCourses) {
        super (studentId, studentName);
        this.numCourses=numCourses;
    } 

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
    
}
