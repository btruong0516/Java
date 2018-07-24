package com.btruong;

public class Challenges {

    public static void main (String[] args) {

        double myFirstNumber = 20d;

        double mySecondNumber = 80d;
        double myTotalNumber  = ((myFirstNumber + mySecondNumber) * 25d);

        double MyRemainderNumber = (myTotalNumber % 40d);

        if(MyRemainderNumber <= 20)
            System.out.println("Total was over the limit");


    }
}

