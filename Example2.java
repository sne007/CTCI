/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTCI.chap5;

/**
 *
 * @author SNEHITH
 */
public class Example2 {
    public static void main(String args[]){
        
    }
    // checks if the given bit is set in binary representation of "num". If its set, then return 1
    static boolean getBit(int num, int bit_num){
        return ((num & (1<<bit_num)) != 0);
    }
    // if the given bit number is zero, this function sets it to 1 and returns the number.
    static int set_bit(int num, int bit_num){
        return num|(1<<bit_num);
    }
    // if the given bit number is 1, this function clears the bit.
    static int clear_bit(int num, int bit_num){
        return num & ~(1<<bit_num);
    }
}
