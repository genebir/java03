package org.genebir.myapp;

import java.util.Scanner;

public class star04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int money = sc.nextInt();

        System.out.print("금액을 입력하세요 >>> ");
        for(int won : unit) {
            System.out.println(won + "짜리 : " + money / won + "개");
            money = money % won;
        }



    }

}
