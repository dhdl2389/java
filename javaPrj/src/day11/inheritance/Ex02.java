package day11.inheritance;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c = new Animal();

		Cat a = new Cat();
		// Cat이 Animal을 상속 받았다면
		// Cat형 객체는 Cat형으로 다룰 수도 있고 Animal형으로 다룰 수도 있다

		Dog b = new Dog();
		// Dog형 Animal을 상속 받았다면
		// Dog형 객체는 Dog형으로 다룰 수도 잇꼬 Animal형으로 다룰 수도 있다

		print(a);
		print(b);

		printCat(a);
		// printDog(b);

	}

	public static void print(Animal animal) { // Animal형을 매개변수로 받음 , Cat형과 Dog형을 Animal형으로 다룰 수 있다.
		animal.짖는다();
		animal.잔다();
	}

	public static void printDog(Dog dog) {
		dog.짖는다();
	}

	public static void printCat(Cat cat) {
		cat.짖는다();
		cat.잔다();
	}

}
