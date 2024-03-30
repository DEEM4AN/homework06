package homework06;

public class Pair<T, U> implements Pairable<T, U>{
    T o1;
    U o2;

    @Override
    public T getFirst() {
        return this.o1;
    }

    @Override
    public U getSecond() {
        return this.o2;
    }

    @Override
    public void setFirst(T first) {
        this.o1 = first;
    }

    @Override
    public void setSecond(U second) {
        this.o2 = second;
    }
}
