package companyprogram;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike honda = new MotorBike();
		MotorBike city = new MotorBike();

		honda.start();
		city.start();

		honda.setSpeed(100);
		System.out.println(honda.getSpeed());

		city.setSpeed(80);
		System.out.println(city.getSpeed());
	}

}
