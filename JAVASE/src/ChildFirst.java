public class ChildFirst<T> extends Parent<T>{
    @Override
    public T getValue() {
        return super.getValue();
    }
}

//子类也是泛形类的时候 要保持标识相同
