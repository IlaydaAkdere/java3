/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İLAYDA AKDERE
 */
class UserManager {

    

  public  Class UserManager {

        public void add(User user) {
            System.out.println("[LOG] New user added : " + user.getFirstName() + " " + user.getLastName());
        }

        public void update(User user) {
            System.out.println("[LOG] User updated : " + user.getFirstName() + " " + user.getLastName());
        }

        public void delete(User user) {
            System.out.println("[LOG] User deleted : " + user.getFirstName() + " " + user.getLastName());
        }

        public void read(User user) {
            System.out.println("-------------------------");
            System.out.println("USER DEFAULT INFO");
            System.out.println("--------------------------");
            System.out.println(user.getFirstName() + " " + user.getLastName());
            System.out.println("Age : " + user.getAge());
            System.out.println("gender : " + user.getgender());
            System.out.println("E-Mail : " + user.geteMail());
            System.out.println("------------------------------");
        }

        public void comment(User user, String comment) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " : " + comment);
        }

    }
