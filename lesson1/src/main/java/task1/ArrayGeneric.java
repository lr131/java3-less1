package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayGeneric<T> {
    private T[] arr;

    public ArrayGeneric(T... elems) {
        this.arr = elems;
    }

    public void print() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод, который меняет два элемента массива местамию
     * @param indexFirst индекс первого элемента
     * @param indexSecond индекс второго элемента
     */
    public void swap(int indexFirst, int indexSecond) {
        T tmp = this.arr[indexFirst];
        this.arr[indexFirst] = this.arr[indexSecond];
        this.arr[indexSecond] = tmp;
    }

    /**
     * Метод, который преобразует массив в ArrayList.
     * @return ArrayList установленного типа
     */
    public ArrayList<T> convertToArrayList() {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, this.arr);
        return arrayList;
    }
}
