package by.academy.deal;

public class Wine extends Product{
	Double volume;
	Integer age;
	private String color;

	public Wine(double price, String name, String manufacture, int quantity, String color, Integer age) {
		super(name, price, manufacture, quantity);
		this.color = color;
		this.age = age;
	}

	// create discount for Wine
	@Override
	public double discount() {
		if (color.equals("red")) {
			discount = 1 - 0.17;
		} else if (color.equals("white")) {
			discount = 1 - 0.1;
		} else if (color.equals("triTopora")) {
			discount = 1 - 0.5;
		} else if (age >= 5){
			discount = 1 - 0.15;
		}

		return discount;
	}

	public void Volume(double volume) {
		this.volume = volume;
	}

	public void Color(String color) {
		this.color = color;
	}

	public void Age(Integer age) {
		this.age = age;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
