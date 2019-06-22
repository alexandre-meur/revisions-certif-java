package revisions.test1Model.q5;

abstract class Planet{
    protected void revolve() {}
    abstract void rotate();
}

public class Earth extends Planet{
    /**
     * Visibilitée par défaut (package) moins visible que protected (package + classes filles) :
     * Erreur de compilation car une méthode abstraite (revolve) implémentée
     * dans une classe fille (Earth) doit être au moins aussi visible que dans sa définition
     */
    //void revolve(){}

    /**
     * protected plus visible que la visibilitée par défaut : pas de problème
     */
    protected void rotate() {

    }
}
