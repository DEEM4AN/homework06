package homework06;

import java.util.ArrayList;
import java.util.List;

public class DataContainer<T> implements Container<T> {
    List<T> dataList = new ArrayList<>();
    @Override
    public void add(T item) {
        dataList.add(item);
    }

    @Override
    public T get(int index) {
        try {
            return (T) dataList.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!! Индекс выходит за границу массива");
        }
        return null;
    }

    @Override
    public void remove(int index) {
        try {
            dataList.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!! Индекс выходит за границу массива");
        }
    }

    @Override
    public int getSize() {
        return dataList.size();
    }
}
