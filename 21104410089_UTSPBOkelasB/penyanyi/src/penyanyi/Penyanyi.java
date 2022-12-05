/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyanyi;

/**
 *
 * @author USER
 */
public class Penyanyi extends Pop{

    public static void main(String[] args) {
        Pop pop = new Pop ("Black Pink", "How Like That");
        Dangdut dangdut = new Dangdut();
        pop.singer("Eclat Story"); 
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        
        String Penyanyi = "Joko Chandra";
        Penyanyi = Dangdut.Penyanyi; 
        Dangdut.song("Via Vallen","Kopi Dangdut");
        dangdut.cetakLabel();
    }
}