public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("Hello, my name is %s!", name);
    }

    public static void main(String[] args) {
        Person me = new Person("Travis");
        String newName = "T-Payne";

        System.out.printf("Testing Person getName() method: %s\n", me.getName());
        System.out.printf("Setting my name to %s...\n", newName);
        me.setName(newName);
        System.out.printf("Testing Person sayHello() method: %s\n", me.sayHello());
    }
}