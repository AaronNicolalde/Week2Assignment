package com.eduanico;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = {1, 2, 3, 4};

        Results res = new Results();
        res.calcMin(array);
        res.calcMax(array);
        res.calcAvg(array);

        System.out.println(res);

    }
}
