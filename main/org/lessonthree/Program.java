package org.lessonthree;

public class Program {

    public static void main(String[] args) {
        loop(100);
        loop(200);
        loop(300);
    }

    public static void loop(int count) {
        while (count > 0) {
            System.out.println("Count is: " + count);
            count--;
        }
    }
}
