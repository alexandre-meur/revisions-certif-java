package revisions.test1Model.q2;

/**
 * Quelle méthode affiche Equal
 */
public class AppQ2 {

    public static void mainA(String[] args){
        String str1 = "Java";
        String str2 = new String("java");
        String str3 = str2;
        if(str1 == str3)
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }

    public static void mainB(String[] args){
        String str1 = "Java";
        String str2 = new String("java");
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.print("Equal");
        }else{
            System.out.print("Not Equal");
        }
    }

    public static void mainC(String[] args){
        String str1 = "Java";
        String str2 = new String("java");
        String str3 = str2;
        if(str1.equals(str3))
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }

    public static void mainD(String[] args){
        String str1 = "Java";
        String str2 = new String("java");
        if(str1.toLowerCase() == str2.toLowerCase())
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
