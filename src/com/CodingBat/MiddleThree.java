package com.CodingBat;

public class MiddleThree {

    public static String middleThree(String word) {

        int midCharS = ((word.length() / 2) - 1);
        int midCharE = midCharS + 3;
        String mid3 = (word.substring(midCharS, midCharE));

        System.out.println(word.substring(midCharS, midCharE));
        return mid3;
    }

    public static void main(String[] args) {

        String word = "CodingBat";

        middleThree(word);
    }
}