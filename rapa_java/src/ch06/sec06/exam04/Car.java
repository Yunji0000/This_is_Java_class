package ch06.sec06.exam04;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	Car() {  //생성자
}

	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}