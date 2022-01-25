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
public class Student {
    private String name;
    private String number;
    private String studentId;
    private String studentName;
    private String address;

    public Student(String name, String number, String studentId, String studentName, String address) {
        this.name = name;
        this.number = number;
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
    