package chapter1.io;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // TODO: 사용자로부터 이름을 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = in.nextLine();

        // TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = in.nextInt();

        // TODO: 입력받은 값 출력
        System.out.println("출력 결과: ");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
