/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İLAYDA AKDERE
 */
public class Students extends User {

    private int schoolNumber;//okul numarası
    private int whichClass;//hangı(kacıncı) sınıf
    private int numberOfLesson;//sınıf numarası
    private String department;//bölümü
    private String schoolName;//okul adı
    private String faculty;//fakültesi

    public Students() {

    }

    public Students(int id, String firstName, String gender, int age, String eMail, int schoolNumber, int whichClass, int numberOfLesson, String department, String schoolName, String faculty) {
        super(id, firstName, gender, age, eMail);
        this.schoolNumber = schoolNumber;
        this.whichClass = whichClass;
        this.numberOfLesson = numberOfLesson;
        this.department = department;
        this.schoolName = schoolName;
        this.faculty = faculty;
    }

    /**
     * @return the schoolNumber
     */
    public int getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * @param schoolNumber the schoolNumber to set
     */
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    /**
     * @return the whichClass
     */
    public int getWhichClass() {
        return whichClass;
    }

    /**
     * @param whichClass the whichClass to set
     */
    public void setWhichClass(int whichClass) {
        this.whichClass = whichClass;
    }

    /**
     * @return the numberOfLesson
     */
    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    /**
     * @param numberOfLesson the numberOfLesson to set
     */
    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the schoolName
     */
    public String getSchoolName() {
        return "Mucur MYO";
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
