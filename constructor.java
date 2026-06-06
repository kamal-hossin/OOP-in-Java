class Student {
    String name;
    int age;
    int id;

    // Constructor
    Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 123);  // Object creation using constructor

        s1.display();
    }
}