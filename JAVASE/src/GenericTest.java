import java.util.ArrayList;

    //T创建对象的时候指定具体的类型
    class Generic<T>{
        private T key;

        public Generic(T key){
            this.key = key;
        }


        public T getKey(){
            return key;
        }

        //泛型方法public 和<T>不可少
        public <T> T showKeyName(Generic<T> container){
            System.out.println("container key: "+container.getKey());
            T test = container.getKey();
            return test;
        }

        public static void main(String[] args){
            //编译检查类型
            //减少数据类型转换
            ArrayList<String> strList = new ArrayList<>();
            strList.add("a");
            strList.add("b");
            strList.add("c");

        }
    }

