/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penyanyi;

/**
 *
 * @author Rizka Magvira
 * Kelas TI-B
 * NIM 21104410089
 */
public class Pop {

String penyanyi = "Raisa"; 
String lagu = "Kali Kedua";

Pop () {

}

Pop (String penyanyi, String lagu) { 
    this.penyanyi = penyanyi;
    this.lagu = lagu;  
    System.out.println(this.penyanyi+" <=> "+this.lagu);

}

public void singer (String penyanyi) {
    this.penyanyi = penyanyi;

}

protected void song (String lagu) { this.lagu = lagu;

}

    void cetakLabel () {
        System.out.println(this.penyanyi+" <=> "+this.lagu);

}
}