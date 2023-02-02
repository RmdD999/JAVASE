package FundamentalDemo;

public class ArrayDemo {
    //数组是可以存放相同类型的数据结构
    //数组中最常用属性为 .length 获取数组长度




    public static void main(String[] args) {
        DogDemo[] dogs = new DogDemo[4];
        dogs[0] = new DogDemo("huahua",4.5);
        dogs[1] = new DogDemo("white",5.6);
        dogs[2] = new DogDemo("black",7.8);
        dogs[3] = new DogDemo("red",9.0);

        int minWeightCounter = 0;
        for(int i=0;i<dogs.length;i++){
            for(int k=1;k<dogs.length;k++){
                if(dogs[i].weight<dogs[k].weight){
                    minWeightCounter++;
                    if(minWeightCounter==dogs.length-1){
                        System.out.println("the thinest dog's name is: " + dogs[i].name);
                        minWeightCounter=0;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }

        int maxWeightCounter = 0;
        for(int i=0;i<dogs.length;i++){
            for(int k=1;k<dogs.length;k++){
                if(dogs[i].weight>dogs[k].weight){
                    maxWeightCounter++;
                    if(maxWeightCounter==dogs.length-1){
                        System.out.println("the heiviest dog's name is: " + dogs[i].name);
                        maxWeightCounter=0;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
    }


}

class DogDemo {
    String name;
    double weight;

    DogDemo(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
}
