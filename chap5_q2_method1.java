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
public class chap5_q2_method1 {
    public static void main(String args[]){
        System.out.println(RealToBinaryString(0.125));
    }
    static String RealToBinaryString(double num){
        if(num >=1 || num <0)
            return "ERROR";
        StringBuilder sc = new StringBuilder();
        while(num>0){
            if(sc.length() >= 32)
                return "ERROR";
            double temp = num*2;
            if(temp >= 1){
                sc.append("1");
                num = temp-1;                
            }
            else{
                sc.append("0");
                num = temp;
            }
        }
        return sc.toString();
    }
}
