package by.academy.classwork.lesson10;

public class EnumDeal {

	public static void main(String[] args) {
		WeekDays weekDay = WeekDays.MONDAY;
		
		switch (weekDay) {
		case MONDAY:
		System.out.println("Today is Monday!");
		break;
		case THUESDEY:
			System.out.println("Today is Thuesday!");
			break;
		case WEDNESDAY:
			System.out.println("Today is Thuesday!");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday!");
			break;
		case FRIDAY:
			System.out.println("Today is Friday!");
			break;
		case SATURDAY:
			System.out.println("Today is Saturday!");
			break;
		case SUNDAY:
			System.out.println("Today is Sunday!");
			break;
		default:
			System.out.println("qwe");
		}
		
		// TODO Auto-generated method stub

	}

}
