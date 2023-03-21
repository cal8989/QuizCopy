//package com.paradeeez.myapplication;
//
//public class QuestionLoader {private int option;
//    private int totalQuestion;
//    private int currentQuestionIndex;
//    private String[] question;
//    private String[][] choices;
//    private String[] correctAnswers;
//
//    public QuestionLoader(int option) {
//        this.option = option;
//        if (option == 1) {
//            Animals setCategories = new Animals();
//            this.question = setCategories.getQuestions();
//            this.choices = setCategories.getChoices();
//            this.correctAnswers = setCategories.getCorrectAnswers();
//        } else if (option == 2) {
//            Color setCategories = new Color();
//            this.question = setCategories.getQuestions();
//            this.choices = setCategories.getChoices();
//            this.correctAnswers = setCategories.getCorrectAnswers();
//        }
//        this.totalQuestion = question.length;
//        this.currentQuestionIndex = 0;
//    }
//
//    public int getTotalQuestion() {
//        return totalQuestion;
//    }
//
//    public String getCurrentQuestion() {
//        return question[currentQuestionIndex];
//    }
//
//    public String[] getCurrentChoices() {
//        Random rand = new Random();
//        int randomAnsA = rand.nextInt(choices.length);
//        int randomAnsB = rand.nextInt(choices.length);
//        int randomAnsC = rand.nextInt(choices.length);
//        int randomAnsD = rand.nextInt(choices.length);
//
//        while (randomAnsA == randomAnsB || randomAnsA == randomAnsC || randomAnsA == randomAnsD) {
//            randomAnsA = rand.nextInt(choices.length);
//        }
//        while (randomAnsB == randomAnsA || randomAnsB == randomAnsC || randomAnsB == randomAnsD) {
//            randomAnsB = rand.nextInt(choices.length);
//        }
//        while (randomAnsC == randomAnsA || randomAnsC == randomAnsB || randomAnsC == randomAnsD) {
//            randomAnsC = rand.nextInt(choices.length);
//        }
//
//        String[] currentChoices = {
//                choices[currentQuestionIndex][randomAnsA],
//                choices[currentQuestionIndex][randomAnsB],
//                choices[currentQuestionIndex][randomAnsC],
//                choices[currentQuestionIndex][randomAnsD]
//        };
//
//        return currentChoices;
//    }
//
//    public String getCurrentCorrectAnswer() {
//        return correctAnswers[currentQuestionIndex];
//    }
//
//    public void moveToNextQuestion() {
//        currentQuestionIndex++;
//    }
//}
