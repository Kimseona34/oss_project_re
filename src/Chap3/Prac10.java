package Chap3;

public class Prac10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int count = 0;

        int i;
        int j;
        while(count < 16) {
            ++count;
            i = (int)(Math.random() * 4.0D);
            j = (int)(Math.random() * 4.0D);
            if (arr[i][j] != 0) {
                --count;
            } else if (count <= 10) {
                arr[i][j] = (int)(Math.random() * 10.0D + 1.0D);
            } else {
                arr[i][j] = 0;
            }
        }

        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 4; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}

