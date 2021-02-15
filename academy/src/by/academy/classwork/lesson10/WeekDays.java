package by.academy.classwork.lesson10;

public enum WeekDays {

	MONDAY("1"), THUESDEY("2"), WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"), SUNDAY("7");
	
	private String s;
	
	WeekDays(String s){
		this.setS(s);
	}
	
	public void allDays() {
	for (int i = 0; i < WeekDays.values().length; i++) {
		WeekDays c = WeekDays.values()[i];
		System.out.println(c + " " + c.ordinal());
	}
  }

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
