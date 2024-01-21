import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer;

    public Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

class Quiz {
    private List<Question> questions;
    private int userScore;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.userScore = 0;
    }
   public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();

            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Enter your answer (1-" + options.size() + "): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectAnswer()) {
                System.out.println("Correct!\n");
                userScore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Quiz complete. Your score: " + userScore + "/" + questions.size());
    }
}
class OnlineQuizApplication {
    public static void main(String[] args) {
        // Create questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("which one is the fastest animal?", List.of("Cheeta", "Cat", "Tiger"), 1));
        questions.add(new Question("How many days are there in a leap year?", List.of("364", "366", "365"), 2));
        questions.add(new Question("What is the national river of India ?", List.of("Yamuna", "Ganga", "Kaveri"), 2));
        questions.add(new Question("Who is the father of c programming?", List.of("Guido van Rossum", "Charles Babbage", "Dennis Ritchie"), 3));

        // Create quiz
        Quiz quiz = new Quiz(questions);

        // Start the quiz
        quiz.startQuiz();
    }
}
