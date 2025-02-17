package reflections.customeobjectmapper;

public class Person {
    private String name;
    private String city;
    private int age;

    @Override
    public String toString() {
        return "Person{Name='" + name + "', Age=" + age + ", City=" + city + "}";
    }

}
