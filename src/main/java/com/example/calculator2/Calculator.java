package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<Integer> results = new ArrayList<>();

    // 생성자
    public Calculator () {
        this.results = new ArrayList<>();
    }

    // Getter 메서드
    public List<Integer> getResults () {
        return results;
    }

    // Setter 메서드
//    public void setResults () {
//        this.results.add(result);
//    }

    // 메서드
    public int calculate (int fNum, int sNum, char operator) {
        // 계산된 결과값을 담을 변수
        int result = 0;

        switch (operator) {
            case '+':
                result = fNum + sNum;
                break;

            case '-':
                result = fNum - sNum;
                break;

            case '*':
                result = fNum * sNum;
                break;

            case '/':
                result = fNum / sNum;
                break;
        }

        // 결과 출력
        System.out.println("계산된 결과 : " + result);

        // 컬렉션 타입 저장 필드에 추가
        results.add(result);

        // 반환하는 값
        return result;
    }

    public void removeResult() {
        results.remove(0);
    }
}
