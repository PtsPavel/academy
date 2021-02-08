package by.academy.deal;

public class Chees extends Product{
	
	String type;
	Double age;
	Double waight;
    
	public Chees() {
		super();
	}
	public Double getWaight() {
		return waight;
	}
	public void setWaight(Double waight) {
		this.waight = waight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	
	public Chees discount() {
		if (age > 20) {
		return price * 1.2; 
		}
		return
	}
}
