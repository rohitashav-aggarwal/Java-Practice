/**Binary Search algorithm
 Input: A sorted array of n elements (arr[]), given element to search (x)
 Output: index of given element in the array
 Time Complexity = O(log n)
 */

package Java.Algorithms;

public class BinarySearchAlgorithm {

    static int binarySearch(int[] arr, int x){
        // right and left indexes
        int left = 0;
        int right = arr.length - 1;

        // iterate through indexes and narrow down the right index using midpoint
        while(left <= right){
            int mid = left + ((right - left) / 2);

            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                right = mid - 1;
            }else{
                right = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1, 2, 4, 7, 7, 9, 9, 10}, 7));
    }
}
