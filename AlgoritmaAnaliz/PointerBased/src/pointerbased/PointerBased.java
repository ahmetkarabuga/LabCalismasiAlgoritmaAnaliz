/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointerbased;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author AHMET KARABUĞA
 */
public class PointerBased {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList list= new LinkedList();
        Scanner s= new Scanner(System.in);
        
        list.add(4);
        list.add(35);
        list.add(67);
        list.add(159);
        list.add(85);
        list.add(68);
        list.add(12);
        list.add(73);
        
        list.listele();
        System.out.println("----------");
        System.out.println("Kacinci indexteki sayiyi bulalım");
        int index= s.nextInt();
        list.indexAccess(index);
    }
    
}
