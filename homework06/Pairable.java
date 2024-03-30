package homework06;

public interface Pairable<T, U> {
    T getFirst();
    U getSecond();
    void setFirst(T first);
    void setSecond(U second);
}
