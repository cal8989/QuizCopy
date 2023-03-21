package com.paradeeez.myapplication;

import java.util.Random;

public class QuestionAnswer {

    public static String question[] ={
            "What animal is this?",
            "Do you know the name of the animal?",
            "Could you identify the animal by name?",
            "What do you call this animal?"

    };

    public static String choices[][] = {
            {"Cat", "Bird", "Goat", "Cow"},
            {"Armadillo", "Cat", "Giraffe", "Elephant"},
            {"Duck","Horse","Dog","Chicken"},
            {"Rabbit","Grasshopper","Dolphin","Bee"}


    };

    public static String correctAnswers[] = {
            "Goat",
            "Giraffe",
            "Chicken",
            "Rabbit"

    };

    public static String getChoices(int row, int col) {
        return choices[row][col];
    }

    public static String getCorrectAnswers(int row) {
        return correctAnswers[row];
    }
}
