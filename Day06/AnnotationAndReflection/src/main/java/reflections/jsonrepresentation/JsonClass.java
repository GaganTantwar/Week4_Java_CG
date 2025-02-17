package reflections.jsonrepresentation;
import java.util.*;
import java.lang.reflect.*;
public class JsonClass {
    public static String tojson(Object obj){
        if(obj==null){
            return "null";
        }
        Class<?> cls=obj.getClass();
        StringBuilder sb=new StringBuilder();
        sb.append("{");
        Field []fields=cls.getDeclaredFields();
        List<String> jsonPair=new ArrayList<>();
        for(Field field: fields){
            field.setAccessible(true);
            try{
                Object value=field.get(obj);
                jsonPair.add("\""+ field.getName()+"\":"+ value);
            }
            catch(IllegalAccessException e){
                jsonPair.add("\""+ field.getName()+ "\":null");

            }
        }
        sb.append(String.join(",",jsonPair));
        sb.append("}");
        return sb.toString();
    }
    public static void main(String args[]){
        Student student=new Student("Raj",23,"Basti",new String[]{"Cricket","Reading"},Arrays.asList(63,89,78));
        String json=tojson(student);
        System.out.println(json);
    }

}