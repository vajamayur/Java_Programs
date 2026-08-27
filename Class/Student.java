public class Student{

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public void display(){
        System.err.println("--- Student Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

