package by.academy.classwork.lesson10;

public class NoGeneticBox<T> {
	T item;
	
	public NoGeneticBox(T item) {
		this.item = item;
				
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
