/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan48.kalkulator;

/**
 *
 * @author Lenovo 
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator objKal = new Kalkulator();
        objKal.setValue1(7.0);
        objKal.setValue2(5.0);
        System.out.println("VALUE 1 = " + objKal.getValue1());
        System.out.println("VALUE 2 = " + objKal.getValue2());
        objKal.setNameProject();
        objKal.setNoteProject("");
        System.out.println("Result Add is = " + objKal.add());
        System.out.println("Result Minus is = " + objKal.minus());
        System.out.println("Result Multiple is = " + objKal.multiplication());
        System.out.println("Result Division is = " + objKal.division());
    }

}
