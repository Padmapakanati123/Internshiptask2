import java.util.*;
public class Quiz {
	private String title;
    private List<String> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public void Quiz(String title2) {
		// TODO Auto-generated constructor stub
	}

	public void addQuestion(String question) {
        questions.add(question);
    }

    // Other methods for managing questions
}

