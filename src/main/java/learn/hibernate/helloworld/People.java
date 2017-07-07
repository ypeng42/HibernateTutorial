package learn.hibernate.helloworld;

public class People {
    private String name;
    private int age;

    private int id;

    /**
     * The no-argument constructor, which is also a JavaBean convention, is a requirement for all persistent classes.
     * Hibernate needs to create objects for you, using Java Reflection. The constructor can be private.
     * However, package or public visibility is required for runtime proxy generation and efficient data retrieval
     * without bytecode instrumentation.
     */
    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
