package DataStructures;

import java.util.Scanner;

/**Insertion-sort algorithm
Input: An array A of n comparable elements
Output: The array A with elements rearranged in non-decreasing order
for k from 1 to n−1 do
Insert A[k] at its proper location within A[0], A[1], . . ., A[k].
*/

public class SortingAnArray {
    // sorting method returns char array
    static char[] insertionSort(char[] charArray){
        int n = charArray.length;
        for(int i = 1; i < n; i++){
            char c = charArray[i];
            int k = i;
            while(k > 0 && charArray[k-1] > c){
                charArray[k] = charArray[k-1];
                k--;
            }
            charArray[k] = c;
        }
        return charArray;
    }
    public static void main(String[] args) {
        char[] alpha = new char[26]; // char array with fixed length 26
        Scanner s = new Scanner(System.in);
        int i = 0;
        // condition: i<alpha.length unless it will throw indexOutOfBound Exception
        // testing with 5 elements
        while (i < 5){
            System.out.println("Enter a character: ");
            char c = s.next().charAt(0);
            alpha[i] = c;
            i++;
        }
        System.out.println("Array without sorting: ");
        System.out.println(alpha);
        System.out.println("Array with sorting: ");
        System.out.println(insertionSort(alpha));
    }
}