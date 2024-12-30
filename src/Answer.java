public class Answer {
    private Character letter;
    private String answer;
    private boolean isTrue;

    public Answer(Character letter, String answer, boolean isTrue) {
        this.letter = letter;
        this.answer = answer;
        this.isTrue = isTrue;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
