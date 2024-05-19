public class Human {
    static String className;

    static String getClassName() {
        return className;
    }

    private String name;
    public int age;
    public float height;
    public float weight;

    public Human(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }


}
