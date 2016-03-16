package tw.com.jimmy.lab;

//ref: http://blog.csdn.net/xiaanming/article/details/8703708
public class ClassRoom {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student student = new Student(teacher);

		student.askQuestion("123");
	}
}
