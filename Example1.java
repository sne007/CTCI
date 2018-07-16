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

// Arithmetic vs logical shift demonstration
// we observe that arithmetic and logical shifts are same for positive numbers
// But for negative numbers, the sign bit is duplicated after right shifting in arithmetic while opposite happens in logical.
public class Example1 {
    public static void main(String args[]){
        System.out.println(logical_shift(-32));
        System.out.println(arithmetic_shift(-32));
    }
    static int logical_shift(int a){
// logical right shift a by 1.
        return a>>>1;
    }
    static int arithmetic_shift(int a){
// arithmetic right shift a by 1.
        return a>>1;
    }
}
