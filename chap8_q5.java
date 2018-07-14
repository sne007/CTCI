/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTCI.chap8;

/**
 *
 * @author SNEHITH
 */
// recursive multiply naive
public class chap8_q5 {
    public static void main(String args[]){
        int p = 8;
        int q = 6;
        System.out.println(multiply_fast(Math.max(p,q),Math.min(p, q)) + "naive "+ multiply_slow(Math.max(p,q),Math.min(p, q),1));
    }
    static int multiply_fast(int p, int q){
        if(q == 1)
            return p;
        else if(q == 0)
            return 0;
        else{
            System.out.println("count 1");
            if(q%2 == 0)
                return (multiply_fast(p,q/2)<<1);
            else{
// brackets are important because addition happens first                
                return p+ (multiply_fast(p,q/2)<<1);
            }
        }
    }
    static int multiply_slow(int p, int q, int i){
        if(i == q)
            return p;
        else{
            System.out.println("count ");
            return p+multiply_slow(p,q,i+1);
        }
    }
}
