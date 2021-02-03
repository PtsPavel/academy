package by.academy.deal;

public class Vine extends Product{
	
	Double gradus;
	String color;
	Integer age;
	Integer voluem;
	
	public Vine() {
		super();
	}
	public Integer getVoluem() {
		return voluem;
	}
	public void setVoluem(Integer voluem) {
		this.voluem = voluem;
	}
	public Double getGradus() {
		return gradus;
	}
	public void setGradus(Double gradus) {
		this.gradus = gradus;
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

