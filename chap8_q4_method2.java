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
public class chap8_q4_method2 {
    public static void main(String args[]){
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        
        ArrayList<ArrayList<Integer>> a1lSubSets = new ArrayList<ArrayList<Integer>>();
        a1lSubSets.add(new ArrayList<Integer>());
    }
    static void generateSubsets(int i, ArrayList<ArrayList<Integer>> ar, int[] array){
        if(i == array.length){
            printSubSets(ar);
            return;
        }
        else{
            ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
            moreSubSets.addAll(ar);
            for(int j=0; j<ar.size();j++){
                ar.add(new ArrayList<Integer>(ar.get(j)));
            }
        }
    }
    static void printSubSets(ArrayList<ArrayList<Integer>> ar){
        
    }
}
