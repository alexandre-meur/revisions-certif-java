package revisions.test1Model.q8;

public class AppQ8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //in the order : 1 2 3 4 5
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }

        //in the reverse order : 5 4 3 2 1
        for(int i = array.length - 1 ; i >= 0 ; i--){
            System.out.print(array[i]+" ");
        }

        //alternating elements in the order : 1 3 5 2 4
        //juste pour une longueur impaire : (i == array.length-1)?1:i+2
        //La solution ci-dessous fonctionne pour les longueurs paires et impaires
        for(int i = 0 ; i < array.length ; i = (array.length%2 == 0)? (i == array.length-2)?1:i+2 : (i == array.length-1)?1:i+2){
            System.out.print(array[i]+" ");
        }
    }
}
