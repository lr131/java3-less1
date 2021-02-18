package task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * Написать метод, который меняет два элемента массива местами.
         * (массив может быть любого ссылочного типа);
         */
        ArrayGeneric<Integer> arr = new ArrayGeneric<>(1,2,3,4);
        arr.print();
        arr.swap(0,2);
        arr.print();

        /**
         * Написать метод, который преобразует массив в ArrayList.
         */
        ArrayList<Integer> arrayList = arr.convertToArrayList();
        System.out.println(arrayList.getClass());
    }
}
