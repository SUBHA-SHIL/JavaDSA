package ArrayAdv;

import java.util.HashMap;
import java.util.Scanner;

public class highestOccuringValue {
    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i: freq.keySet()) {
            System.out.println(i + " -> " + freq.get(i));
        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int currentKey : freq.keySet()) {
            int currentKeyFreq = freq.get(currentKey);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }


    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int ans = getMode(arr);
        System.out.println(ans + " is the most occurring value.");

    }
}
