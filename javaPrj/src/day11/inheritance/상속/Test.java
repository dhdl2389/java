package day11.inheritance.상속;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student a = new Student();
		a.걷는다();
		a.공부한다();
		a.말한다();
		a.먹는다();
		a.잠잔다();

		StudentWorker b = new StudentWorker();
		b.걷는다();
		b.공부한다();
		b.말한다();
		b.먹는다();
		b.잠잔다();
		b.일한다();

		Researcher c = new Researcher();
		c.걷는다();
		c.말한다();
		c.먹는다();
		c.연구한다();
		c.잠잔다();

		Professor d = new Professor();
		d.가르친다();
		d.걷는다();
		d.공부한다();
		d.먹는다();
		d.말한다();
		d.잠잔다();
	}

}
