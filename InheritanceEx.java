class Person{
    int age;
    public String name;
    protected int height;
    private  int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Student extends Person{
    public void set(){
        age = 31;
        name = "형섭리";
        height = 183;
        setWeight(82);//weight = 82;
    }
}

public class InheritanceEx {

}
