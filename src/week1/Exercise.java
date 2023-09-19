package week1;

import java.util.Scanner;
import java.util.Stack;

public class Exercise {
    public static void main(String[] args) {
//        ex1();
//        System.out.println(now(3661));
//        double[] res = cirAndArea(0,0,2,0);
//        System.out.println(res[0] + " " + res[1]);
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println(now(input));

//        System.out.println(createParan(3));
    }

    public static void ex1() {
        System.out.println("*********************");
        System.out.println("* gay month over :( *");
        System.out.println("*********************");
    }

    public static int[] swap(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
        return arr;
    }

    public static String now(int secToMidnight) {
        String res = "";
        int current = secToMidnight;

        res += current / 3600 + ":";
        current %= 3600;

        res += current / 60 + ":";
        current %= 60;

        res += current;
        return res;
    }

    public static void mileToKm() {

    }

    public static double[] cirAndArea(int ax, int ay, int bx, int by){
        double len = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
        return new double[] {len * 4, len * len};
    }


}
