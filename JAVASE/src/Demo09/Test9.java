package Demo09;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.chrono.Era;
import java.util.ArrayList;

/**
 * 类型擦除，泛型只存在于编译阶段。
 */
public class Test9 {
    public static void main(String[] args) {
//        ArrayList<Integer> intList = new ArrayList<>();
//        ArrayList<String> strList = new ArrayList<>();
//
//        System.out.println(intList.getClass().getSimpleName());
//        System.out.println(strList.getClass().getSimpleName());
        Eraser<Integer> eraser = new Eraser<>();
        //利用反射获取字节码文件的class类对象
        Class<? extends Eraser> clz = eraser.getClass();
        Field[] declareFields = clz.getDeclaredFields();

        for (Field declareField : declareFields) {
            System.out.println(declareField.getName()+" : "+declareField.getType().getSimpleName());
        }


        Method[] declaredMethods = clz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+":"+declaredMethod.getReturnType().getSimpleName());
        }
        
        System.out.println("--------------------------");
        Class<InfoImpl> infoClass = InfoImpl.class;
        Method[] infoImplMethods = infoClass.getDeclaredMethods();
        for (Method infoImplMethod : infoImplMethods) {
            System.out.println(infoImplMethod.getName()+": "+infoImplMethod.getReturnType().getSimpleName());
        }


    }
}
