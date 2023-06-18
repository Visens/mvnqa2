package ru.netology.services;
public class VacationService {
    public int calculate(int income, int expenses) {
        int count = 0;
        int money = 0;
        int treshold = 120_000;
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) {
                count++;
                money = money - expenses - (expenses * 3);
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
