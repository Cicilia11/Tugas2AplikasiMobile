/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author CiCiLiA
 */
public class Latihan2 {
    public static void main(String[] args) {
        int umur = 23;
        String paras = "Cantik";
        String kecerdasan ="Pintar";
        
        if(paras=="Cantik"&&kecerdasan=="Pintar"&&(umur>=20&&umur<=23)){
            System.out.println("Pasti Mau");
        }
        else if ((kecerdasan=="Gak Pintar"||paras=="Cantik")&&(umur>=20&&umur<=23)){
            System.out.println("OK Lah");
        }
        else if ((kecerdasan=="Gak Pintar"||umur>23)&&paras=="Cantik"){
            System.out.println("Saya Pikir Dulu");
        }
        else{
            System.out.println("No Way");
        }
    
    }
    
}
