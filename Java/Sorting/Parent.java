public class Parent {

    public Parent(){

    }

    public void a () {
        System.out.println("a");
    }

    public void b () {
        System.out.println("b");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.a();
        p.b();

        Parent p2 = new Child();
        p2.a();
    }
}