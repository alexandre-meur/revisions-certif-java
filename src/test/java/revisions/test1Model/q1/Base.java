package revisions.test1Model.q1;

public class Base {
    public void test(){
        System.out.print("Base ");
    }
    public static void main(String[] args){
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }

}

class DerivedA extends Base{
    public void test(){
        System.out.print("Derived A ");
    }
}

class DerivedB extends DerivedA{
    public void test(){
        System.out.print("Derived B ");
    }


}
