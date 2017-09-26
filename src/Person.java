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

        // Problem 2
        /*
         * The String equals method checks if a string is "deep" equals to another string.
         * The first test should return true.
         * The double equals tests the "shallow" equality (are the memory locations equal).
         * The second test should return false.
         */
        //Person person1 = new Person("John");
        //Person person2 = new Person("John");
        //System.out.println(person1.getName().equals(person2.getName()));
        //System.out.println(person1 == person2);
        /*
         * Output:
         * true
         * false
         */

        /*
         * The assignment operator assigns a copy of the reference (memory location).
         * The statement being printed should be true
         */
        //Person person1 = new Person("John");
        //Person person2 = person1;
        //System.out.println(person1 == person2);
        /*
         * Output:
         * true
         */

        /*
         * Because the assignment assigns the reference of one object to another, the
         * two will point to the same object. Modifying one instance has the effect of modifying both,
         * because the two references point to the same object.
         * the output should be the following:
         * John
         * John
         * Jane
         * Jane
         */
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        /*
         * Output:
         * John
         * John
         * Jane
         * Jane
         */
    }
}