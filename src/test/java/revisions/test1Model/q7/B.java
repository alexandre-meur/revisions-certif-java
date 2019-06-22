package revisions.test1Model.q7;

public class B {
    private int doStuff() {
        //private ne devrait pas être utilisé ici
        /*private*/ int x = 100;
        return x++;
    }
}
