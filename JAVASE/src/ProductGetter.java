import java.util.ArrayList;
import java.util.Random;

public class ProductGetter<T> {
    private T product;
    Random random = new Random();

    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T t){
        list.add(t);
    }

    public T getProduct(){
        product = list.get(random.nextInt(list.size()));
        return product;
    }
}
