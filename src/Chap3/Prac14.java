package Chap3;

import java.util.Scanner

public class Prac14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] course = new String[]{"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = new int[]{95, 88, 76, 62, 55};

        while(true) {
            int flag = false;
            System.out.print("과목 이름>>");
            String name = scanner.next();
            if (name.equals("그만")) {
                scanner.close();
                return;
            }

            for(int i = 0; i < course.length; ++i) {
                if (course[i].equals(name)) {
                    System.out.println(name + "의 점수는 " + score[i]);
                    flag = true;
                }
            }

            if (!flag) {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}

}
