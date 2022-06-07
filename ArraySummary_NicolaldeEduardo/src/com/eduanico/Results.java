package com.eduanico;

public class Results
{
    private int min;
    private int max;
    private double average;

    public Results() {
        this.min = 0;
        this.max = 0;
        this.average = 0;
    }

    public int calcMin(int[] array){
        min = array[0];
        for(int num : array){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public int calcMax(int[] array){
        max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public double calcAvg(int[] array) {
        for(int num : array){
            average +=num;
        }
        average = average/array.length;
        return average;
    }

    @Override
    public String toString() {
        return "{" +
                "\n min:" + min +
                ", \n max:" + max +
                ", \n average: " + average +
                "\n}";
    }
}
