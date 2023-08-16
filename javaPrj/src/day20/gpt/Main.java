package day20.gpt;

class Greeting {
	private String message;

	public Greeting(String message) {
		this.message = message;
	}

	public void displayMessage() {
		System.out.println(message);
	}
}

public class Main {
	public static void main(String[] args) {
		Greeting hello = new Greeting("Hello Java!");
		hello.displayMessage();
	}
}
