/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author İLAYDA AKDERE
 */
public class CourseManager {
   public void Kayit(Course course){
       System.out.println(course.kursAdi+" adlı kursa kayıt oldunuz.");
   }
   public void Giris(Course course){
       System.out.println(course.kursAdi + " kursuna hoşgeldiniz...");
   }
   public void KayitSilme(Course course){
       System.out.println(course.kursAdi + " kursundan kaydınız silinmiştir...");
   }
}
