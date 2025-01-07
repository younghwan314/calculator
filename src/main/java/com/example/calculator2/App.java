package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 스캐너
        Scanner sc = new Scanner(System.in);

        // Calculator 객체 생성
        Calculator cal = new Calculator();

        // 반복문 작동을 위한 변수
        boolean run = true;

        // 반복문
        while (run) {
            // 첫 번째 숫자를 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int fNum = sc.nextInt();

            // 두 번째 숫자를 입력받기
            System.out.print("두 번째 숫자를 입력하세요: ");
            int sNum = sc.nextInt();

            // 사칙연산 입력받기
            System.out.print("사칙연산을 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 계산 실행
            cal.calculate(fNum, sNum, operator);

            // getter
            System.out.println("현재 저장된 값들 : " + cal.getResults());

            // 삭제
            System.out.println("첫 번째 결과를 삭제하시겠습니까? (Y/N)");
            String remove = sc.next();
            if (remove.equals("Y")) {
                cal.removeResult();
                System.out.println(cal.getResults());
            } else if (remove.equals("N")) {

            }

            // 반복문 종료
            System.out.println("더 계산하기겠습니까? (Y/N)");
            String exit = sc.next();
            if (exit.equals("N")) {
                break;
            } else if (exit.equals("Y")) {

            }
        }
    }
}
