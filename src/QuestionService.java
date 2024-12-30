import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuestionService {
    List<Question> questions = new ArrayList<>();

    public QuestionService() {
        questions.add(new Question(1, "What is the capital of France?", Arrays.asList(
                new Answer('A', "Berlin", false),
                new Answer('B', "Madrid", false),
                new Answer('C', "Paris", true),
                new Answer('D', "Rome", false)
        )));

        questions.add(new Question(2, "What is 2 + 2?", Arrays.asList(
                new Answer('A', "3", false),
                new Answer('B', "4", true),
                new Answer('C', "5", false),
                new Answer('D', "6", false)
        )));

        questions.add(new Question(3, "Who wrote 'Romeo and Juliet'?", Arrays.asList(
                new Answer('A', "William Shakespeare", true),
                new Answer('B', "Charles Dickens", false),
                new Answer('C', "Jane Austen", false),
                new Answer('D', "Mark Twain", false)
        )));

        questions.add(new Question(4, "What is the chemical symbol for water?", Arrays.asList(
                new Answer('A', "O2", false),
                new Answer('B', "H2O", true),
                new Answer('C', "CO2", false),
                new Answer('D', "HO", false)
        )));

        questions.add(new Question(5, "Which planet is known as the Red Planet?", Arrays.asList(
                new Answer('A', "Earth", false),
                new Answer('B', "Venus", false),
                new Answer('C', "Mars", true),
                new Answer('D', "Jupiter", false)
        )));

    }

    public void playQuiz(){
        int result = 0;
        for (Question question : questions) {
            System.out.println("Question " + question.getId() + ": " + question.getQuestion());
            for (Answer answer : question.getAnswers()) {
                System.out.println(answer.getLetter() + ". " + answer.getAnswer());
            }
            System.out.println();

            //System.out.println(question.getTrueAnswer().getLetter());
            Scanner sc = new Scanner(System.in);
            Character answer = sc.nextLine().charAt(0);

            if (question.getTrueAnswer().getLetter().equals(answer)) {
                System.out.println("Your answer is true.");
                result++;
            }
        }

        System.out.println("Your Result is " + result);
    }
}
