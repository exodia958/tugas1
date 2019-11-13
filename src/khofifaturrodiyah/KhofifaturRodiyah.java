/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khofifaturrodiyah;

/**
 *
 * @author Moch Lutfi
 */
public class KhofifaturRodiyah {

    /**
     * @param args the command line arguments
     */
    public static void checkIPK (double ipk) {
        // static void checkIPK(double ipk) {



   

    if (ipk > 3.5) {

      System.out.println("Caumlaude");



   

    } 

    

    else if (ipk > 3.0) {

      System.out.println("Sangat memuaskan");

    }

    else if (ipk > 2.75){

      System.out.println("Memuaskan");

    }

    else if (ipk > 2.5){

      System.out.println("Cukup");

    }

    else {

      System.out.println("IPK Jelek. kuliah ngapain aja?");
      System.out.println ("Cari Jodoh :v");
    }



  }



  public static void main(String[] args) {

    checkIPK(2.0); //masukan IPK kamu mislakan (2.45 sampai 4.00)

  }

    }
    

