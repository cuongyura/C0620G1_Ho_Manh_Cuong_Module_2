package _10_DAD_List.bai_Tap._1_Method_ArrayList;

import java.util.Arrays;

public class BaiTapMyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    Object[] data;

    public BaiTapMyList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public BaiTapMyList(int capacity) {
        data = new Object[capacity];
        //E[] data = (E[]) new Object[capacity];
    }

    public void add(int index, E element) {
        if (size >= data.length) {
            ensureCapacity(data.length / 2);
        }
        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        E element = (E) data[index];
        if (size - 1 - index >= 0) System.arraycopy(data, index + 1, data, index, size - 1 - index);
        data[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public BaiTapMyList<E> clone() {
        BaiTapMyList<E> baiTapMyList_2 = new BaiTapMyList<>();
        baiTapMyList_2.data = Arrays.copyOf(this.data, this.size);
        baiTapMyList_2.size = this.size;
        return baiTapMyList_2;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
//        for (int i = 0; i < size; i++) {
//            if (element.equals(data[i])) {
//                return true;
//            }
//        }
//        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        if (size >= data.length) {
            ensureCapacity(data.length / 2);
        }
        data[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        data = Arrays.copyOf(data, data.length + minCapacity);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E get(int index) {
        checkIndex(index);
        return (E) data[index];
    }

    public void clear() {
        //data = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }
}
