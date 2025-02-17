package reflections.jsonrepresentation;
import java.util.*;
public class Student {
    private String name;
    private int age;
    private String city;
    private String[] hobbies;
    private List<Integer> scores;
    public Student(String name,int age,String city,String []hobbies,List<Integer> scores){
        this.name=name;
        this.age=age;
        this.city=city;
        this.hobbies=hobbies;
        this.scores=scores;
    }
}
