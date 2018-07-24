package com.btruong;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;


        result = result *10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println( previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        final int i = result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);
        result %= 9;
        System.out.println("Result is now " + result);


        // second line = have 2 equal sign that set to test if the contain is false or it is false
        boolean isBao = false;
        if (isBao == false)
            System.out.println("     ");
            System.out.println("It is not a Human!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the highest score!");


        // && mean AND


        System.out.println( "\n");
        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore <100))
            System.out.println("Greater than second top score and less then 100");


        System.out.println( "\n");
        if((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these test is true");


        System.out.println( "\n");
        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an error");


        System.out.println( "\n");
        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");


        System.out.println( "\n");
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true\n");


        // CHALLENGES


        System.out.println( "\n");
        double myFirstNumber = 20d;

        double mySecondNumber = 80d;
        double myTotalNumber  = ((myFirstNumber + mySecondNumber) * 25d);

        double MyRemainderNumber = (myTotalNumber % 40d);

        if(MyRemainderNumber <= 20)
            System.out.println("Total was over the limit");





    }
}
