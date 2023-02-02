package FundamentalDemo;

public class ProductGetterDemo {
    public static void main(String[] args){
        ProductGetter<String> prdGetter = new ProductGetter<>();
        String[] strProducts = {"iphone","Ipad","coffee machine"};

        for (int i =0;i<strProducts.length;i++){
            prdGetter.addProduct(strProducts[i]);
        }

        String product = prdGetter.getProduct();
        System.out.println(product);
    }
}
