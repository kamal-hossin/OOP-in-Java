class Student {

    void study() {
        System.out.println("Student studies");
    }
}

class Teacher {

    void teach() {
        System.out.println("Teacher teaches");
    }
}

// Hybrid concept: combining multiple behaviors using single child class
class Monitor extends Student {

    void helpClass() {
        System.out.println("Monitor helps in class");
    }
}

class Classroom extends Teacher {

    void manage() {
        System.out.println("Classroom is managed by monitor");
    }
}

public class hybrid_inheritance {

    public static void main(String[] args) {

        Monitor m = new Monitor();
        m.study();
        m.helpClass();

        Classroom c = new Classroom();
        c.teach();
        c.manage();
    }
}