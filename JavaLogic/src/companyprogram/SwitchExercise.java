package companyprogram;

public class SwitchExercise {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(2));
		
	}

	public static String determineNameOfDay(int dayNumber) {
		String result="";
		switch(dayNumber) {
		case 0:
			result = "sunday";
			break;
		case 1:
			result = "monday";
			break;
		case 2:
			result = "tuesday";
			break;
		case 3:
			result="wens day";
			break;
		case 4:
			result="wens day";
			break;
		case 5:
			result="thursday";
			break;
		case 6:
			result="friday";
			break;
		case 7:
			result="saturday";
			break;
		}
		return result;
	}
}
