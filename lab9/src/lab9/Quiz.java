package lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Question> questions = new ArrayList<>();

    public void add(Question question) {
        if (questions.size() < 25) {
            questions.add(question);
        } else {
            System.out.println("Quiz is full. Cannot add more questions.");
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.correctAnswer);
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.size());
        scanner.close();
    }
}

