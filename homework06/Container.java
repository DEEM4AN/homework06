package homework06;

public interface Container<T> {
     // создали интерфейс, в дальнейшем можно спокойно переписать

     void add(T item);
     T get(int index);
     void remove(int index);
     int getSize();
}
