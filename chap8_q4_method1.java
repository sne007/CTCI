/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTCI.chap8;
import java.util.*;
/**
 *
 * @author SNEHITH
 */
public class chap8_q4_method1 {
    public static void main(String args[]){
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;        
        a[3] = 4;
        findSubSets(a);
    }
    static void subset_func(){
        
    }
    
    //helper funciton to clone an array list
    private ArrayList<Integer> cloneSet(ArrayList<Integer> input)
    {
        ArrayList<Integer> clone = new ArrayList();
         
        for (int i = 0;  i < input.size(); i++)
        {
            clone.add(input.get(i));
        }
         
        return clone;
    }
    
    public static void findSubSets(int[] array){
        int[] subs = new int[array.length];
        helper(array, subs, 0);
    }
    
    public static void helper(int[] arr, int[] subs, int i){
        if(i == arr.length){
            print_subsets(subs,arr);
        }
        else{
            subs[i] = arr[i];
            helper(arr,subs,i+1);
            subs[i] = -1;
            helper(arr,subs,i+1);
        }
    }
    static void print_subsets(int[] subs,int[] arr){
            for(int j=0; j<arr.length;j++)
                if(subs[j] != -1)
                    System.out.print(" "+subs[j]);
            System.out.println();        
    }
}