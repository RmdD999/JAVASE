import java.util.ArrayList;

public class TestBox {
    public static void main(String[] args) {
        Box<Number> box = new Box<>();
        box.setFirst(100);
        showBox(box);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(200);
        showBox(box2);
    }

    //？--具体实参数
    //extends指定上限
    public static void showBox(Box<? extends Number> box ){
        Object first = box.getFirst();
        System.out.println(first);
    }

    public static void showHuman(ArrayList<? extends Human> list){
        for (int i = 0; i <list.size() ; i++) {
            Worker worker = (Worker) list.get(i);
            System.out.println(worker);
        }
    }
}
