public class Hw35DogSingleton {
    private static Hw35DogSingleton instance;

    private Hw35DogSingleton() {
    }

    public static Hw35DogSingleton getInstance() {
        if (instance == null) {
            instance = new Hw35DogSingleton();
        }
        return instance;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
