/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Yasas
 */
public class Arrays {
    
    private long[] a;
    private int nELements;
         
    public Arrays(int max){
        this.a = new long[max];
    }
    
    public boolean find(long searchkey){
        
        for(int i=0;i<nELements;i++){
            if(this.a[i]==searchkey){
                System.out.println("found");
                return true;
            
        }
           
        }
           //System.out.println("not found");
             return false;
    }
    
       public void insert(long value){
           if(this.a.length==nELements){
               System.out.println("Array is full");
               return;
           }
           if(find(value)){
               System.out.println("value is already exists");
               return;
               
           }
           else{
              this.a[this.nELements]=value;
                System.out.println("value inserted");
              nELements++;
           }
       }
       
         public boolean delete(long value){
            for(int i=0;i<nELements;i++){
                if(this.a[i]==value){
                    for(int j=i;j<this.nELements-1;j++){
                   this.a[j]=this.a[j+1];
               }
                    
                    System.out.println("value is deleted");
                   this.nELements--;
                   return true;
                }
               
                   
               
            } 
               System.out.println("value is not matched");
               return false;
            
         }
           public void display(){
               System.out.println("Array Elements");
               for(int i=0;i<nELements;i++){
                   System.out.print(this.a[i] + " ");
               }
               System.out.println();
           }
           

    /**
     * @param args the command line arguments
     *///174148G
    static int counter = 0;
    public static void main(String[] args) {

int[]a = {5,2,1,10,12,2,4,9};
 
    int max=a[0];
    int min=max;
   
        for (int i = 0; i < a.length-1; i++) {
            
            if (max<a[i+1]) {
                max=a[i+1];
                counter++;
            }
             if (min>a[i+1]) {
                min=a[i+1];
                counter++;
                
            }
            
        }
        
        System.out.println(counter);
        System.out.println("Max is :"+max);
        
        System.out.println("Min is :"+min);
    }
}
//        
//        Scanner sc =new Scanner(System.in);
//         //int[][] k={{1,2},{5,7},{3,5}};
////    int[][] k =new int[2][3];
////        for (int i = 0; i < k.length; i++) {
////            
////            for (int j = 0; j < k[i].length; j++) {
////                k[i][j]=sc.nextInt();
////            }
////            System.out.println();
////        }
////        
////        for (int i = 0; i < k.length; i++) {
////            
////            for (int j = 0; j < k[i].length; j++) {
////                System.out.print(k[i][j]+" ");
////            }
////            System.out.println();
////        }
//
//
//int count  = 0;
//
//        String[] p={"dddd","aaaa","cccc","pppp"};
//        for (int i = 0; i < p.length; i++) {
//            count=count+p[i].length();
//            System.out.println(p[i].toUpperCase());
//           
//            
//        }
//        System.out.println(count);
//        char[] m=new char[count];
//        int count2=0;
//        for (int i = 0; i < p.length; i++) {
//            
//            for (int j = 0; j < p[i].length(); j++) {
//                m[count2]=p[i].charAt(j);
//                count2++;
//            }
//            //
//            
//            
//        }
//        
//        for (int i = 0; i < m.length; i++) {
//            System.out.print(m[i]+" ");
//        }

        
//counting vowels
//
//String pp="AEiou";
//int c=0;
//        for (int i = 0; i < pp.length(); i++) {
//            System.out.println(pp.charAt(i));
//            if
//        }
//
//          
//    }
    
    
   
    
//}
