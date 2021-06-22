package mcqPractise;

class Parent {
	int num;
}
public class Child extends Parent{
	

}
class App {
	public static void main(String[] args) {
		Child child = new Child();
		int num =10;
		System.out.println(child.num);
	}
}
