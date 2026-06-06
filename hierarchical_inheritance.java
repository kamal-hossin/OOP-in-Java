class Student {

    void study() {
        System.out.println("Student studies");
    }
}

class Teacher extends Student {

    void teach() {
        System.out.println("Teacher teaches");
    }
}

class Monitor extends Student {

    void help() {
        System.out.println("Monitor helps students");
    }
}

public class hierarchical_inheritance {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        Monitor m1 = new Monitor();

        t1.study();
        t1.teach();

        m1.study();
        m1.help();
    }
}