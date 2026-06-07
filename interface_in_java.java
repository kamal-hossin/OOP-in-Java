interface Phone {
    void display();
}

class SmartPhone implements Phone {
    public void display() {
        System.out.println("This is a smartphone.");
    }
}

public class interface_in_java {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.display();
    }
}