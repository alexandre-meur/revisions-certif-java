package revisions.test1Model.q4;

public class AppQ4 {
    String myStr = "7007";

    public void doStuff(String str) {
        String myStr = str;
        int myNum = 0;
        try {
            /*
            myStr ci-dessous (ligne 12) est déjà défini. Le code de cette question ne compile pas.
            String myStr = str;
             */
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException ne) {
            System.out.print("Error");
        }
        System.out.println("myStr = " + myStr + ", myNum = " + myNum);
    }

    public static void main(String[] args) {
        AppQ4 obj = new AppQ4();
        obj.doStuff("9009");
    }
}
