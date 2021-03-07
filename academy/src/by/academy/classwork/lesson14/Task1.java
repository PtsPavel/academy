package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<HeavyBox> list = new ArrayList<>();
		
		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox2 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox3 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox4 = new HeavyBox(1, 2, 3, 4);
		
		list.add(hbox1);
		list.add(hbox2);
		list.add(hbox3);
		list.add(hbox4);
		
		for (HeavyBox b : list) {
			System.out.println(b);
		}
		
		list.get(0).setWeight(1);
		
		list.remove(list.size()-1);
		//1 вариант
		Object[] objectArray = list.toArray();
		System.out.println(Arrays.toString(objectArray));
		
		//2 вариант
		HeavyBox[] stringArray1 = new HeavyBox[list.size()];
		list.toArray(stringArray1);
		System.out.print(Arrays.toString(stringArray1));
		
		
		
	}

}
