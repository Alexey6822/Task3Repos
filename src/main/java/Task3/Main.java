/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

/**
 *
 * @author Aleksey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = new int[100];
       for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random());
            //System.out.println(array[i]);
        }
       float countOne = 0, countZero = 0, result = 0;
       for (int i = 0; i < array.length; i++){
           if (array[i] == 1) countOne++;
           if (array[i] == 0) countZero++;
       }
       result = countOne/countZero;
       System.out.println(String.format("Result for array[100] = %s",result));
       int[] array1 = new int[1000];
       for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random());
            //System.out.println(array1[i]);
        }
       float countOne1 = 0, countZero1 = 0, result1 = 0;
       for (int i = 0; i < array1.length; i++){
           if (array1[i] == 1) countOne1++;
           if (array1[i] == 0) countZero1++;
       }
       result1 = countOne1/countZero1;
       System.out.println(String.format("Result for array[1000] = %s",result1));
       int[] array2 = new int[10000];
       for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.round(Math.random());
            //System.out.println(array2[i]);
        }
       float countOne2 = 0, countZero2 = 0, result2 = 0;
       for (int i = 0; i < array2.length; i++){
           if (array2[i] == 1) countOne2++;
           if (array2[i] == 0) countZero2++;
       }
       result2 = countOne2/countZero2;
       System.out.println(String.format("Result for array[10000] = %s",result2));
    }
    
}
