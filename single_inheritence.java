class Student{
    String name;
    int age;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}


class Teacher extends Student{
    int salary;
    void display(){
        super.display(); // Call the display method of the parent class
        System.out.println("Salary: "+salary);
    }
}


public class single_inheritence{
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.name = "Mr. Smith";
        t1.age = 40;
        t1.salary = 50000;

        t1.display(); // This will call the display method of Teacher, which also calls the display method of Student
    }
}