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

// The number of possible ways to climb up stairs given that a person can climb only 1, 2 or 3 stairs at a time.
public class Chap8_q1_naive {
// The logic is pretty straight forward with naive recursion. 
// When a person is on the ground initially, he can climb up n-1 stairs, and the rest of the work becomes climbing 1 stair.    
// When a person is on the ground initially, he can climb up n-2 stairs, and the rest of the work becomes climbing 2 stairs.    
// When a person is on the ground initially, he can climb up n-3 stairs, and the rest of the work becomes climbing 3 stairs.    

    public static void main(String args[]){
        System.out.println(stairs(3));
    }
    static int stairs(int n){
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
// below, *(1) is because you move n-1 stairs and rest 1 stair has 1 way to climb up. Similarly for the rest of the two. 
        else        
            return stairs(n-1)*(1)+stairs(n-2)*(1)+stairs(n-3)*(1);
    }
}
