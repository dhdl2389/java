package day12.재열병진;

public class Archer extends Player {

	public Archer() {
		this.Hp = 80;
		this.Attack = 100;
	}

	public String GameEnding() {
		this.End = " 화살 3개로 세상을 구할 것 입니다.";
		return End;

	}
}
