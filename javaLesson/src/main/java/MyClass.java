public class MyClass {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals is called: " + this + " : " + obj);
        MyClass other = (MyClass)obj;
        return id.equals(other.id) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode is called: " + this);
        return id.intValue();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
