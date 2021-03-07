package by.academy.homework.no5;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        try {
            for (int i = 0; i <= 10; i++) {
                arr[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Array is to small, expand the array");
        }
    }
}