class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing by Pen");
    }
    public void getColor(){
        System.out.println(this.color);
    }
    public void getType(){
        System.out.println(this.type);
    }
}

/**
 * Student
 */
class Student {
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
    Student(String name , int age ){
        this.age = age;
        this.name = name;
    }
    Student(){
        // 
    }
}

public class OOP {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "Gel";
        p1.getColor();
        p1.getType();

        Student s1 = new Student("Ashu", 19);
        System.out.println(s1.name);
        System.out.println(s1.age); 
    }
}