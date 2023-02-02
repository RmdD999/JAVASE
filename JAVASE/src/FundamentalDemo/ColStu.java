package FundamentalDemo;

public class ColStu {
    private int age;
    private String name;
    private float fee;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFee() {
        return fee;
    }
    public void setFee(float fee) {
        this.fee = fee;
    }

    //缴费
    public void pay(float fee)
    {
        this.fee=0.5f*fee;
    }
}
