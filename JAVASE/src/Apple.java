public class Apple<T,E> implements Generator<T>{
    //如果没有指定特定类型，按照Object -- 不是泛型类
    private T t;
    private E value;
    @Override
    public T getKey() {
        return t;
    }

    public E getValue(){
        return value;
    }

    public Apple(T t, E value){
        this.t = t;
        this.value = value;
    }
}
