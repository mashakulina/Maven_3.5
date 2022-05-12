package ru.netology.sqr;

public class SQRService {

    public int numberOfSqr(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= a && x <= b) {
                count++;
            }
        }

        return count;

    }

}
