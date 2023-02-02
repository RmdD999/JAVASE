package FundamentalDemo;

public class ParentDemo {
    public static void main(String[] args) {
        ChildFirst<String> cldFst= new ChildFirst<String>();
        cldFst.setValue("ab");
        System.out.println(cldFst.getValue());

        ChildSecond cldSed = new ChildSecond();
        cldSed.setValue("pp");
        System.out.println(cldSed.getValue());
    }
}
