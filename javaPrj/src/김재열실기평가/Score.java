package 김재열실기평가;

public class Score {
	String name;
	int kor;
	int eng;
	char grade;

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcGrade();
	}

	public Score() {
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", calcGrade=" + grade + "]";
	}

	public void calcGrade() {
		int sum = kor + eng;
		int avg = sum / 2;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else
			grade = 'F';

	}

}
