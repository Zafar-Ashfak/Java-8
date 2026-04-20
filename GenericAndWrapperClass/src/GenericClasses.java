public class GenericClasses {
    public static void main(String[] args) {
        Fish<String> tuna = new Fish<>("tuna1211");
        System.out.println(tuna.getId());

        Fish<String> shark = new Fish<>("Shark98098");
        System.out.println(shark.getId());

        Fish<Integer> whale = new Fish<>(900);
        System.out.println(whale.getId());

// ****************************************************************************
        System.out.println("_________________________________________________");
        Dog<String, String> d1 = new Dog<>("Tommy3295", "Tommy");
        System.out.println("Dog Id: " + d1.getId() + ", Name: " +  d1.getName());

        Dog<String, String> d2 = new Dog<>("Bob2144", "Bob");
        System.out.println("Dog Id: " + d2.getId() + ", Name: " +  d2.getName());

        Dog<Integer, String> d3 = new Dog<>(134, "Jacky");
        System.out.println("Dog Id: " + d3.getId() + ", Name: " +  d3.getName());

    }
}

class Fish<E> {
    E id;

    public Fish(E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }
}


class Dog<E, V> {
    E id;
    V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;
    }

    V getName() {
        return name;
    }
}
