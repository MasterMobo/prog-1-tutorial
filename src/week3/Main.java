package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(randArray(5)));
        int[] arr = {1,2,6,4};
        exchangeMinFrom(arr, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selectionSort(randArray(100))));
        String a = "abc";
        String b = "def";
        swapString(a, b);
    }

    public static int[] randArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (int) Math.round(random() * n);
        }

        return res;
    }

    public static int getMin(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[res]) res = i;
        }

        return res;
    }

    public static int getMinFrom(int[] arr, int from) {
        int res = from;
        for (int i = from; i < arr.length; i++) {
            if (arr[i] < arr[res]) res = i;
        }

        return res;
    }

    public static void exchangeMinFrom(int[] arr, int from) {
        int res = from;
        for (int i = from; i < arr.length; i++) {
            if (arr[i] < arr[res]) res = i;
        }

        // Swap from and res
        int temp = arr[from];
        arr[from] = arr[res];
        arr[res] = temp;

    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            exchangeMinFrom(arr, i);
        }

        return arr;
    }

    public static void swapString(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static ArrayList<Integer> occurOnce(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        freq.forEach((key, val) -> {
            if (val == 1) res.add(key);
        });

        return res;
    }
}
