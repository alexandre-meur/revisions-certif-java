package revisions.test1Model.q3;


import java.util.ArrayList;

public class AppQ3 {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }catch(RuntimeException re){
            System.out.print("Caught a RuntimeException");
        }catch(Exception e){
            System.out.print("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
