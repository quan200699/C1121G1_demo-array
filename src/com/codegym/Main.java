package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        int array2[] = {2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng");
            array[i] = scanner.nextInt();
        }
        System.out.println("Sử dụng for-i");
        //Sử dụng vòng lặp for-i để duyệt mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Sử dụng vòng lặp for-each để duyệt mảng
        System.out.println("Sử dụng vòng lặp for-each");
        for (int element : array) {
            System.out.println(element);
        }
        int sum = tongMang(array);
        int sum2 = tongMang(array2);
        System.out.println(sum);
        System.out.println(sum2);
//        int tong = sum(3, 4);
//        System.out.println(tong);
    }

    //Xây dựng hàm tính tổng với 2 tham số a và b và trả về tổng 2 số đó
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //Xây dựng hàm tính tổng các ptu có trong 1 mảng
    public static int tongMang(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        return tong;
    }
}
