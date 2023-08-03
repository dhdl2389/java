package day12.재열병진;

public class Warrior extends Player {

	public Warrior() {
		this.Hp = 200;
		this.Attack = 50;
	}

	public String GameEnding() {
		this.End = " 검과 도끼 방패로 세상을 구할 것 입니다.";
		return End;
	}
}
