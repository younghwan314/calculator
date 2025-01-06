
package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        // 반복문 작동을 위한 변수
        boolean run = true;

        // 반복해서 작동(종료를 하고 싶을 때 "exit" 입력)
        while (run) {
            // 숫자와 사칙연산 입력받기
            Scanner sc = new Scanner(System.in);

            // 첫 번째 숫자 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int fNum = sc.nextInt();

            // 두 번째 숫자 입력받기
            System.out.print("두 번째 숫자를 입력하세요: ");
            int sNum = sc.nextInt();

            // 사칙연산 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 계산한 값을 담을 변수
            int result = 0;

            // 입력받은 양의 정수로 계산하기
            switch (operator) {

                case '+':
                    int sum = fNum + sNum;
                    result = sum;
                    break;

                case '-':
                    int min = fNum - sNum;
                    result = min;
                    break;

                case '*':
                    int mul = fNum * sNum;
                    result = mul;
                    break;

                case '/':
                    if (sNum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. 다시 입력하세요.");
                        continue;
                    }
                    int div = fNum / sNum;
                    result = div;
                    break;

                default:
                    System.out.println("잘못된 연산기호입니다. 다시 입력하세요.");
                    continue;
            }
            System.out.println("계산된 결과값: " + result);

            // 종료
            System.out.print("더 계산하시겠습니까? (exit 입력시 종료): ");

            // exit 입력받을 변수
            String finish = sc.next();

            if (finish.equals("exit")) {
                System.out.println("계산기를 종료하겠습니다.");
                run = false;
            }
        }
    }
}