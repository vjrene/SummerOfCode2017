/** problem taken from https://www.hackerrank.com/challenges/30-2d-arrays
 * limitiations:
 * 6x6 array
 * digits entered can be between -9 and 9 inclusive **/

package com.vanessography;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // initialize 6x6 array
        int arr[][] = new int[6][6];

        Scanner scan = new Scanner(System.in);

        //read user input, put numbers into array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = scan.nextInt();
            }
        }


        int maxSum = -63; //if every number in the hourglass is -9, the total will be -63
        int hourglassSum = 0;

        //get the sums of the hourglasses and compare
        for (int i=0; i<arr.length-2; i++) {
            for (int j=0; j<arr.length-2; j++){

                //defining hourglass
                hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if(hourglassSum>maxSum) { maxSum = hourglassSum; }
            }
        }

        System.out.println(maxSum);
    }
}
