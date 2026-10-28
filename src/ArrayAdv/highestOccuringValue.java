package ArrayAdv;

import java.util.HashMap;
import java.util.Scanner;

public class highestOccuringValue {
    static int[] getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i: freq.keySet()) {
            System.out.println(i + " -> " + freq.get(i));
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        int minFreq = Integer.MAX_VALUE;
        int minFreqKey = Integer.MAX_VALUE;

        for (int currentKey : freq.keySet()) {
            int currentKeyFreq = freq.get(currentKey);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            } else if (currentKeyFreq < minFreq) {
                minFreq = currentKeyFreq;
                minFreqKey = currentKey;
            }

        }
        return new int[]{maxFreqKey, minFreqKey};
    }


    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int[] result = getMode(arr);
        System.out.println(result[0] + " is the most occurring value.");
        System.out.println(result[1] + " is the least occurring value.");


    }
}
//int[] result = numOfZeros_Ones(arr);
//        System.out.println("Number of Ones: " + result[0]);
//        System.out.println("Numbers of Zeros: " + result[1]);