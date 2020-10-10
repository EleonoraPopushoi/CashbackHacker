package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }


   // private int actual;
    //
    //    public int remain(int amount) {
    //        if (boundary <= amount) {
    //            return boundary - amount % boundary;
    //        }
    //        if (boundary > amount) {
    //            return boundary - amount % boundary;
    //        }
    //        if (boundary == amount) {
    //            return 0;
    //        }
    //        return actual;
    //    }
}
