/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

public class DataMhs {
    private String nim;
    private String nama;
    private double nilai;
    
    public void SetNim(String vnim){
        try{
            nim = vnim;
            if (nim == null){
                throw new NullPointerException();
            }
        }catch (NullPointerException npe){
            System.out.println("KESEHATAN : "+ "NIM mahasiswa tidak boleh null");
        }
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String vNama){
        try{
            nama = vNama;
            if(nama == null){
                throw new NullPointerException();
            }
        }catch (NullPointerException npe){
            System.out.println("KESALAHAN : "+ "Nama mahasiswa tidak boleh null");
        }
    }
    public String getNama(){
        return nama;
    }
    public void setNilai(int vnilai){
        nilai = vnilai;
    }
    public double getNilai(){
        return nilai;
    }
    }
class DemotThrow{
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.SetNim("101533402134");
        obj.setNama("Rafiif");
        obj.setNilai(80);
        
        System.out.println("NIM : " + obj.getNim());
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Nilai : " + obj.getNilai());
        
    }
}
    

