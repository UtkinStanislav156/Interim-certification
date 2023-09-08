import java.util.HashSet;
import java.util.Objects;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat otherCat = (Cat) o;
        return age == otherCat.age && Objects.equals(name, otherCat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class work {
    public static void main(String[] args) {
        HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Whiskers", 3);
        Cat cat2 = new Cat("Felix", 2);
        Cat cat3 = new Cat("Whiskers", 3); // Дубликат cat1
        Cat cat4 = new Cat("Garfield", 5);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        System.out.println("Содержимое множества catSet:");
        for (Cat cat : catSet) {
            System.out.println(cat);
        }
    }
}
