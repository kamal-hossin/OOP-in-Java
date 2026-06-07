class OuterClass {
    public int sum(int a, int b){
        return a+b;
    }
    class InnerClass {
        public void display(){
            System.out.println("The sum of 5 and 10 is: " + sum(5, 10));
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}