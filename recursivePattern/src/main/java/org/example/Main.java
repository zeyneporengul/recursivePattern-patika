package org.example;
import java.util.Scanner;
public class Main {
    static void recursivePattern(int val) {
        if (val <= 0) {
            System.out.print(val + " ");
            if (val == 0) {
                recursivePattern(val + 5);
            }
            return;
        }
        System.out.print(val + " ");
        recursivePattern(val - 5);
        System.out.print(val + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int val = input.nextInt();
        recursivePattern(val);
    }
}