import java.util.List;

public class Question {
    private int id;
    private String question;
    private List<Answer> answers;

    public Question(int id, String question, List<Answer> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {}

    public Answer getTrueAnswer() {
        return answers.stream().filter(Answer::isTrue).findFirst().orElse(null);
    }
}
