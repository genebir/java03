package org.genebir.myapp;

import java.util.Scanner;

public class star06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 몇 개 저장하시겠습니까(1~100) >>> ");
        int leng = sc.nextInt();
        while(leng > 100 || leng < 1) {
            System.out.println("1~100 사이의 수를 입력하세요");
            leng = sc.nextInt();
        }
        int[] ints = new int[leng];
        for(int i=0; i<ints.length; i++) {
            int no = (int)((Math.random() * 10) + 1);
            System.out.println(no);
            for(int j=0; j<i; j++) {
                if(ints[j] == no) {
                    i--;
                }
            }
        }
        System.out.print("저장된 정수들 : ");
        for(int i=0; i<ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

    }

}
