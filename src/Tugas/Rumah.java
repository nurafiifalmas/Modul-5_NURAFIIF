/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

public class Rumah {
     public static void main(String[] args) {
     String identitas = "Nurafiif Almas Azhari / 33 / X RPL 5";
         System.out.println("================================================");
         System.out.println("Identitas : "+identitas);
         System.out.println("================================================");
         
     System.out.println("Pembaca lirik");
     int [] a = new int [5];
     try{        
            a [10] = 15;  
        }
        catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Kesalahan Array");
        }
        catch (Exception e){
            System.out.println("Kesalahan umum");
            
        }catch (Throwable t){
             System.out.println("Throwable");
        }
         System.out.println("Penyebab Eksepsi");
        }
        }
