package DataStructures;

/**PseudoRandom Number generation
 Input: seed value: 92
 */

public class PseudoRandomNumberGeneration {
    public static void main(String[] args) {
        int[] array = new int[5];
        int seed = 92;
        for (int i = 0; i < array.length; i++){
            array[i] = (12 * seed + 5) % 100;
            seed = array[i];
        }
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}
