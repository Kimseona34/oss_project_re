package Chap3;

import java.util.Scanner;

public class Prac08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?>>");
    int num = scanner.nextInt();
    int[] arr = new int[num];
    int count = 0;

    int i;
        for(i = 0; i < num; ++i) {
        arr[i] = (int)(Math.random() * 100.0D + 1.0D);

        for(int j = 0; j < i; ++j) {
            if (arr[i] == arr[j]) {
                --i;
            }
        }
    }

        for(i = 0; i < num; ++i) {
        System.out.print(arr[i] + " ");
        ++count;
        if (count % 10 == 0) {
            System.out.println();
        }
    }

        scanner.close();
}
}

