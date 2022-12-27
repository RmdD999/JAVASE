package Demo09;

import java.util.List;

public class Eraser <T extends Number>{
    public T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public <T extends List> T showT(T t){
        return t;
    }
}
