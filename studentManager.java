/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İLAYDA AKDERE
 */
public class StudentManager {

    public class StudentManager {

        public void add(Student student) {
            System.out.println("Kullanici adi eklendi : " + student.getLastName());
        }

        public void delete(Student student) {
            System.out.println("Kullanici adi silindi : " + student.getLastName());
        }

        public void update(Student student) {
            System.out.println("Kullanici soyadi güncellendi : " + student.getLastName());
        }

    }
