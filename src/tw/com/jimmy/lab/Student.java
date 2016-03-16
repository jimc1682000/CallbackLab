package tw.com.jimmy.lab;

public class Student implements Callback {
	private Teacher teacher; // 身為學身可以註冊發問權

	public Student(Teacher teacher) {
		this.teacher = teacher;
	}

	public void askQuestion(String question) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				teacher.executeMessage(Student.this, question);
			}
		}).start();

		play();
	}

	public void play() {
		System.out.println("Fooling Around...");
	}

	@Override
	public void solve(String answer) {
		System.out.println("Teacher told Student the answer is: " + answer);
	}
}
