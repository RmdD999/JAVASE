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

    public <E> E getProduct(ArrayList<E> productList){
        return productList.get(random.nextInt(productList.size()));
    }

    public static <T,E,K> void printType(T t,E e, K k){
        System.out.println(t+"\t"+t.getClass().getSimpleName());
        System.out.println(e+"\t"+e.getClass().getSimpleName());
        System.out.println(k+"\t"+k.getClass().getSimpleName());

    }

    //可变参数 泛型方法
    public <E> void print(E... e){
        for (int i = 0; i <e.length ; i++) {
            System.out.println(e[i]);
        }
    }

    public static void main(String[] args){
        ProductGetter<String> productList = new ProductGetter<>();
        ArrayList<String> strList = new ArrayList<>();
        strList.add("macbook");
        strList.add("phone");
        strList.add("robot");
        String res = productList.getProduct(strList);
        System.out.println(res);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        int res2 = productList.getProduct(intList);
        System.out.println(res2);

        System.out.println("---------------------");
        ProductGetter.printType(100,"s",true);

        System.out.println("---------------------");
        productList.print(1,2,3,4,5);
        productList.print("a",1,true);
    }
}
