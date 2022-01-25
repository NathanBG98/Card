/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import findthestudent.Student;

/**
 *
 * @author Ronak
 */
public class studentList {
    public static void main(String[] args){
        Student [] students = new Student[5];
        students[0] = new Student("Cindy","333", 23);
        students[1] = new Student("Barb","222", 22);
        students[2] = new Student("Amy","111", 21);
        students[3] = new Student("Emma","555", 25);
        students[4] = new Student("Diane","123", 24);
        students[5] = new Student("Tyler","567", 65);
        students[6] = new Student("Kyle","341", 87);
        students[7] = new Student("Brianna","677", 11);
        students[8] = new Student("James","789", 46);
        students[9] = new Student("Winston","444", 31);
        students[10] = new Student("Carl","999", 29);
        
            for (int i=0; i< students.length; i++){
                System.out.println(students[i]);
        }
        
    }
}
