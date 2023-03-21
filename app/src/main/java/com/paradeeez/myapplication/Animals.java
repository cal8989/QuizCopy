package com.paradeeez.myapplication;

public class Animals {

    public static String questionAnimal[] ={
            "What animal is this?",
            "Do you know the name of the animal?",
            "Could you identify the animal by name?",
            "What do you call this animal?",
            "What is the name of the above animal?"


    };

    public static String choicesAnimal[][] = {
            {"Cat", "Bird", "Goat", "Cow"},
            {"Armadillo", "Cat", "Giraffe", "Elephant"},
            {"Duck","Horse","Dog","Chicken"},
            {"Rabbit","Grasshopper","Dolphin","Bee"},
            {"Fish","Lion","Snake","Deer"},
            {"Monkey","Gorilla","Bat","Bear"},
            {"Bear","Cat","Giraffe","Rabbit"},
            {"Rabbit","Fox","Fish","Bee"}

    };

    public static String correctAnswersAnimal[] = {
            "Goat",
            "Giraffe",
            "Chicken",
            "Rabbit",
            "Lion",
            "Monkey",
            "Bear",
            "Fox"
    };

    public static String getChoicesAnimal(int row, int col) {
        return choicesAnimal[row][col];
    }

    public static String getCorrectAnswersAnimal(int row) {
        return correctAnswersAnimal[row];
    }
}
