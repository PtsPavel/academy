package by.academy.classwork.lesson14;

import by.academy.classwork.lesson14.HeavyBox;

public class Box {
	double width;
	double height;
	double depth;

	public Box() {
		System.out.println("Конструирование объекта Вох");
		width = 10;
		height = 10;
		depth = 10;
	}

	Box(double depth, double height) {
		this();
		this.getVolume();
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(double len) {
		width = len;
		height = len;
		depth = len;
	}

	/**
	 * Подсчитать объем коробки
	 *
	 * @return Объем
	 */
	double getVolume() {
		return width * height * depth;
	}

	/**
	 * Установить размер коробки
	 *
	 * @param w - ширина
	 * @param h - высота
	 * @param d - глубина
	 */
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	

	
}

