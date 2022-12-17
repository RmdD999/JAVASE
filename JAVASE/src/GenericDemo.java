import java.util.*;
public class GenericDemo {
//    List<String> stringArrList = new ArrayList<String>();
//    List<Integer> intArrList = new ArrayList<Integer>();
//
//    Class classStringArrayList = stringArrList.getClass();
//    Class classIntegerArrayList = intArrList.getClass();

//    if(classStringArrayList.equals(classIntegerArrayList)){
//        Log.d("泛型测试","类型相同");
//    }




    public static void main(String[] args){
        //泛型类型在逻辑上可以看成多种类型，但是实际上是同一种类型

        Generic<String> strGeneric = new Generic<>("abc");
        String key1 = strGeneric.getKey();

        Generic<Integer> intGeneric = new Generic<>(100);
        int key2 = intGeneric.getKey();

        //没有指定类型 将按照object来
        Generic generic = new Generic("ABC");

        //泛型类不支持基础数据类型 int etc.

        System.out.println(strGeneric.getClass());
        System.out.println(intGeneric.getClass());
        
    }

}


