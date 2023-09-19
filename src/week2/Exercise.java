/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2023B
  Assessment: Tutorial 2
  Author: Bui Dang Khoa
  ID: s3978482
  Created  date: 14/08/2023
  Acknowledgement: Lecture slides
*/

package week2;


public class Exercise {
    public static void main(String[] args) {
        drawSquare(5);
        drawEmptySquare(5);
        System.out.println(sqrt(5));
        splitBill(10);
        isOverlap(0.5, 5.1, 13.0, 1.0, 1.7,4.5);
        countRandom(100);
    }

    public static void drawSquare(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawEmptySquare(int len) {
        String outer = "*".repeat(len);
        String inner = "*" + " ".repeat(len-2) + "*";
        StringBuilder res = new StringBuilder();
        res.append(outer).append('\n');
        for (int i = 0; i < len - 2; i++) {
            res.append(inner).append('\n');
        }
        res.append(outer);
        System.out.println(res);
    }

    public static double sqrt(double n) {
        double min = 1;
        double max = n;
        double avg = (max + min) / 2;
        while (Math.abs(n - avg*avg) >= 0.00000001) {
            if (avg*avg > n) {
                max = avg;
            } else {
                min = avg;
            }

            avg = (max + min) / 2;
        }

        return avg;
    }

    public static void splitBill(double s) {
        double div3 = s /3;
    }

    public static void isOverlap(double x1, double y1, double r1, double x2, double y2, double r2) {
        double dist = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (dist >= (r1 + r2)) {
            System.out.println("The two circle does not overlap");
            return;
        }

        if (r1 > r2) {
            System.out.println("Circle 2 is inside circle1");
            return;
        }

        System.out.println("Circle 2 is inside circle1");
    }

    public static void countRandom(int n) {
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            count[(int)(Math.random() * n) + 1 ]++;
        }

        for (int i = 0; i < n; i++) {
            if (count[i] == 0) continue;

            System.out.println(i + ": " + count[i]);
        }
    }
}
