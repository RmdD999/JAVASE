public class ChildSecond extends Parent<String>{
    //如果父类不指定泛型类型，那么就是Objecct类型
    //如果派生子类的时候，如果子类不是泛型类，父类要明确泛型类型

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
}
