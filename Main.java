/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 /* @author İLAYDA

AKDERE
 */
public class Main {

    public void main(String[] argumants) {

        UserManager userManager = new UserManager();
        ınstructorManager instructorManager = new ınstructorManager();
        StudentManager studentManager = new StudentManager();

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("İlayda");
        instructor.setLastName("Akdere");
        instructor.setHomeWorkGiven(3);
        instructor.getHomeworkNumber(1);

        userManager.signUp();
        instructorManager.signUp();
        instructorManager.addHomeWork(instructor);

        System.out.println("/----------------------------------------------------");
        System.out.println();

        Student student = new Student();
        userManager.signUp();
        studentManager.signUp();

        student.setId(1);
        student.setFirstName("Seren");
        student.setLastName("Akyuz");
        student.setStudentNumber(28);
        student.setHomeWorkofNumberTaken(4);
        student.setHomeWorkofNumberGiveUp(2);
        student.getHomeWorkofNumber();

        studentManager.joinTheSystem(student);

        System.out.println("/----------------------------------------------------");
        System.out.println();

        Student student2 = new Student();

        userManager.signUp();
        studentManager.signUp();

        student2.setId(2);
        student2.setFirstName("İrem");
        student2.setLastName("Aksoy");
        student2.setStudentNumber(320);
        student2.setHomeWorkofNumberTaken(7);
        student2.setHomeWorkofNumberGiveUp(1);
        student2.getHomeWorkofNumber();

        studentManager.joinTheSystem(student2);

    }

}
