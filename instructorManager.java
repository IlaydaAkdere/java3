/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İLAYDA AKDERE
 */
public class ınstructorManager extends UserManager {

    public void sıgnUp() {
        System.out.println("new student signUp");
    }

    public void addHomeWork(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getInstructorNumber() + added a new homework.()
        );

        System.out.println("Homework number : " + instructor.getHomeworkNumber() + 1);
    }
}
