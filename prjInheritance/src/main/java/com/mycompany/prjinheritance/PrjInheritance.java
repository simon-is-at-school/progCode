/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance;

/**
 *
 * @author simon
 */
public class PrjInheritance {

    public static void main(String[] args) {
        
    SportStudent sport = new SportStudent("Tiaan");
        System.out.println(sport.attendClass());
        System.out.println(sport.submitAssignment());
        System.out.println(sport.playSport());
        
        ArtStudent art = new ArtStudent("Rheo");
         System.out.println(art.attendClass());
        System.out.println(art.submitAssignment());
        System.out.println(art.isPainting());
        
        MusicStudent music = new MusicStudent("Stephan");
         System.out.println(music.attendClass());
        System.out.println(music.submitAssignment());
        System.out.println(music.pracIntrument());
        
    }
}
