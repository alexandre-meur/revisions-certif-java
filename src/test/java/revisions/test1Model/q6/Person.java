package revisions.test1Model.q6;

public class Person {

    String name;
    int age = 25;

    /**
     * Déclarer un constructeur avec des arguments enlève le constructeur
     * par défaut sans arguments donc this() qui l'apelle provoque une
     * erreur de compilation
     */
    public Person(String name){
        //this();
        setName(name);
    }

    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
