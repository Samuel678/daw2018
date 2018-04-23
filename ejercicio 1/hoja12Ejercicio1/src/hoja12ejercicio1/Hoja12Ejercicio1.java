/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja12ejercicio1;
import java.time.*;
import java.util.*;
/**
 *
 * @author HP
 */
public class Hoja12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);
    
    System.out.println("Di un dia: ");
    int dia=sc.nextInt();
    System.out.println("Di un mes");
    int mes=sc.nextInt();
    System.out.println("Di un año");
    int año=sc.nextInt();
    try{
    LocalDate calendario=LocalDate.of(año, mes, dia);
    System.out.println(calendario);
    }catch (DateTimeException e){
        System.out.println("error");
    }
    }
    
}
