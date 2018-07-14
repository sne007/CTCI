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
public class chap8_q3 {
    public static void main(String args[]){
        int[] arr = new int[11];
        arr[0] = -10;
        arr[1] = -5;
        arr[2] = -2;
        arr[3] = 2;
        arr[4] = 1;
        arr[5] = 3;
        arr[6] = 4;
        arr[7] = 7;
        arr[8] = 9;
        arr[9] = 12;
        arr[10] = 13;
        System.out.println(magicFast(arr,0,10));
    }
    static int magic_index(int[] arr, int l, int r){
        if(l>r)
            return -1;
        int mid = (l+r)/2;
        if(arr[mid]==mid){
            return mid;
        }
        else if(arr[mid]>mid){
            return magic_index(arr,l,mid-1);
        }
        else
            return magic_index(arr,mid+1,r);
    }
    /*
public static int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] > mid){
			return magicFast(array, start, mid - 1);
		} else {
			return magicFast(array, mid + 1, end);
		}
	}
	
	public static int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
	}
        
        */	public static int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		if (midValue == midIndex) {
			return midIndex;
		}
		/* Search left */
		int leftIndex = Math.min(midIndex - 1, midValue);
                    System.out.println(" start: "+start+" leftIndex: "+leftIndex);
		int left = magicFast(array, start, leftIndex);
		if (left >= 0) {
//                    System.out.println(left+"left");
			return left;
		}
		
		/* Search right */
		int rightIndex = Math.max(midIndex + 1, midValue);
                    System.out.println(" rightIndex: "+rightIndex+ " end "+end);
		int right = magicFast(array, rightIndex, end);
		
		return right;
	}
	
	public static int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
	}
}
