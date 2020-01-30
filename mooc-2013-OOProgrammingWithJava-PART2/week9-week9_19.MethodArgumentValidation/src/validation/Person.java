package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        
        if(name == null || name.isEmpty() || name.length() > 40 || age <= -1 || age > 120 ){
            throw new IllegalArgumentException("Name cannot be empty or longer than 40 characters");
        }
        
        this.name = name;
        
            System.out.println("Name cannot be Null");
        
        this.age = age;
        
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
