class Student {
    String name;
    int rollno;

    void getdata(String n, int r) {
        name = n;
        rollno = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
}

class Teacher extends Student {
    String subject;

    void getSubject(String s) {
        subject = s;
    }

    void displayTeacher() {
        System.out.println("Subject: " + subject);
    }
}

class HOD extends Teacher {
    String department;

    void getDepartment(String d) {
        department = d;
    }

    void displayHOD() {
        System.out.println("Department: " + department);
    }
}

public class multi_level_inheritence {
    public static void main(String[] args) {

        HOD h1 = new HOD();

        h1.getdata("Mr. Smith", 101);
        h1.getSubject("Mathematics");
        h1.getDepartment("Science");

        h1.display();
        h1.displayTeacher();
        h1.displayHOD();
    }
}