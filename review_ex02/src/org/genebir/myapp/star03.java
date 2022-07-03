package org.genebir.myapp;

import java.util.Scanner;

public class star03 {

    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 10개를 입력하세요");
        int i = 0;
        while(i<10) {
            int no = sc.nextInt();
            list[i++] = no;
        }
        System.out.print("3의 배수는 ");
        for(int j=0; j<list.length; j++) {
            if(list[j] % 3 ==0) {
                System.out.print(list[j] + " ");
            }
        }

    }

}
