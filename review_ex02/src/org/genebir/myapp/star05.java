package org.genebir.myapp;

import java.util.Scanner;

public class star05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] intList = new int[10];

        System.out.println("정수 10개를 입력하세요.");
        for(int i=0; i<intList.length; i++) {
            int num = sc.nextInt();
            intList[i] = num;
        }
        System.out.print("3의 배수들 : ");
        for(int i=0; i<intList.length; i++) {
            if(intList[i] % 3 == 0) {
                System.out.print(intList[i] + " ");
            }
        }


    }

}
