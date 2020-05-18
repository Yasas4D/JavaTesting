
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
     * 
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
        
       // System.out.println(counter);
        System.out.println("Max is :"+max);
        
        System.out.println("Min is :"+min);
    }
}



        
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
