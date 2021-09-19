package Chap3;

import java.util.Scanner;

public class Prac16 {
    public Prac16() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[]{"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            int n = (int)(Math.random() * 3.0D);
            System.out.print("가위 바위 보!>>");
            String play = scanner.next();
            if (play.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                scanner.close();
                return;
            }

            System.out.print("사용자는 " + play + ", 컴퓨터 = " + str[n] + ", ");
            if (play.equals("가위")) {
                if (str[n].equals("가위")) {
                    System.out.println("비겼습니다.");
                } else if (str[n].equals("바위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (str[n].equals("보")) {
                    System.out.println("사용자가 이겼습니다.");
                }
            } else if (play.equals("바위")) {
                if (str[n].equals("가위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (str[n].equals("바위")) {
                    System.out.println("비겼습니다.");
                } else if (str[n].equals("보")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            } else if (play.equals("보")) {
                if (str[n].equals("가위")) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else if (str[n].equals("바위")) {
                    System.out.println("사용자가 이겼습니다.");
                } else if (str[n].equals("보")) {
                    System.out.println("비겼습니다.");
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
