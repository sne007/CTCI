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
public class chap8_q2_naive {
    public static void main(String args[]){
        int[][] arr = new int[10][10];
        arr[3][2] = 9;
        arr[5][6] = 9;
        arr[3][0] = 9;
        arr[6][6] = 9;
        arr[7][5] = 9;
        arr[5][3] = 9;
        arr[4][2] = 9;
        arr[4][7] = 9;
//        arr[39][38] = 9;
//        arr[38][38] = 9;
        print_path(arr,0,0,10);
    }
    
    static void print_path(int[][] arr, int i, int j, int len){
            print_answer(arr,len);

        if((i>len-1 && j!=len-1) || (i!=len-1 && j>len-1)){
            return;
        }
// 9 is a mine. we are not allowed to step on it.
        else if(arr[i][j] == 9 || arr[i][j] == 9)
            return;
// i and j reaches end, that is the maze is complete
        else if(i == len-1 && j == len-1){
            arr[i][j] = 10;
            print_answer(arr,len);
            return;
        }
        else{
            arr[i][j] = 1;
            print_path(arr,i+1,j,len);
            arr[i][j] = 8;
            print_path(arr,i,j+1,len);
        }
    }
    static void print_answer(int[][] arr, int len){
            for(int l=0;l<len;l++){
                for(int m=0;m<len;m++){
                    System.out.print(arr[l][m]+" ");
                }
                System.out.println();
            }
                System.out.println();
    }    
}
