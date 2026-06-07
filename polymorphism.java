class Phone{
    public void showTime(){
        System.out.println("Time is 9:00");
    }
    public void on(){
        System.out.println("Turning on the phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
}
class IPhone extends SmartPhone{
    public void faceTime(){
        System.out.println("Facetime is on");
    }
}

class Samsung extends SmartPhone{
    public void samsungPay(){
        System.out.println("Samsung Pay is on");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.on();
        iPhone.showTime();
        iPhone.music();
        iPhone.faceTime();

        Samsung samsung = new Samsung();
        samsung.on();
        samsung.showTime();
        samsung.music();
        samsung.samsungPay();
    }
}

