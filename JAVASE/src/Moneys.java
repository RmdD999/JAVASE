import java.util.*;

public class Moneys {
    public static void main(String[] args){
        ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
        monkeyList.add(new Monkey("a"));
        monkeyList.add(new Monkey("b"));
        monkeyList.add(new Monkey("c"));
        monkeyList.add(new Monkey("d"));
        monkeyList.add(new Monkey("e"));
        monkeyList.add(new Monkey("f"));
        monkeyList.add(new Monkey("g"));
        monkeyList.add(new Monkey("h"));
        monkeyList.add(new Monkey("i"));
        monkeyList.add(new Monkey("j"));

        Set<Monkey> monkeySet = new HashSet<Monkey>();
        monkeySet.add(new Monkey("a"));
        monkeySet.remove(new Monkey("a"));

        for(Monkey m:monkeySet){
            if(m.name=="a"){
                System.out.println("We found that.");
            }
        }

        HashMap monkeyMap = new HashMap();
        monkeyMap.put(0,new Monkey("a"));
        monkeyMap.put(1,new Monkey("b"));
        monkeyMap.put(2,new Monkey("c"));
        monkeyMap.put(3,new Monkey("d"));

        monkeyMap.remove(2);
        monkeyMap.get(0);
        monkeyMap.replace(3,new Monkey("f"));
        System.out.println(monkeyMap.values());

        Dictionary d = new Hashtable();
        d.put(0,new Monkey("p"));
    }
}
