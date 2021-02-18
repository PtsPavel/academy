package by.academy.classwork.lesson11;

import java.io.Serializable;
import by.academy.classwork.lesson11.Cat;
import by.academy.classwork.lesson11.ThreeParam;

public class DemoShow {

	public static void main(String[] args) {
		
		ThreeParam<Boolean, Cat , Integer> threeGen = new ThreeParam<>(true, new Cat(), 5);

		threeGen.showTypes();
        System.out.println("Значение T: " + threeGen.getObT());
        System.out.println("Значение V: " + threeGen.getObV());
        System.out.println("Значение K: " + threeGen.getObK());
    }
}



