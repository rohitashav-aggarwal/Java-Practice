package Java.DataStructures;

import java.util.Scanner;

// Given a number input, find the number of distinct digits in it.
public class CountDistinctDigits {

    static int countUnique = 0;

    public static int count(int n){
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        while(n > 0){
            int x = n % 10;
            arr[x]++;
            n = n / 10;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                countUnique++;
            }
        }
        return countUnique;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(count(num));
    }
}
