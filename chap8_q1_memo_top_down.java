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
public class chap8_q1_memo_top_down {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n:");
        int len = sc.nextInt();
        int[] memo = new int[len+1];
        for(int i=0;i<memo.length;i++){
            memo[i] = -1;
        }
        System.out.println(stairs_memo(len,memo));
    }
    static int stairs_memo(int n, int[] memo){
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else if(memo[n] != -1)
            return memo[n];
        else{
            memo[n] = stairs_memo(n-1,memo)+stairs_memo(n-2,memo)+stairs_memo(n-3,memo);
            return memo[n];
        }
    }
}
