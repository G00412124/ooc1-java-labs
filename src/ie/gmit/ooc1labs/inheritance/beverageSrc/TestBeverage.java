package ie.gmit.ooc1labs.inheritance.beverageSrc;

public class TestBeverage {

	public static void main(String[] args) {
		Coffee java = new Coffee();
		Wine cabSav = new Wine();

		java.temperature = 90;
		cabSav.temperature = 9;

		System.out.println(java.isAcceptableTemperature());
		System.out.println(cabSav.isAcceptableTemperature());

		java.getColour();

	}

}
