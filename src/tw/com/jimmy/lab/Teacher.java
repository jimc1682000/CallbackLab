package tw.com.jimmy.lab;

public class Teacher {
	public void executeMessage(Callback callback, String question) {
		System.out.println("Student's Question is: " + question);
		callback.solve("456");
	}
}
