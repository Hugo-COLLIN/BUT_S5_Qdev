public abstract class Employe {
    private String nom;
    private int age;
    private int nbJoursCongesPris;

    public Employe(String name, int age) {
        this.nom = name;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public int getNbJoursCongesPris() {
        return nbJoursCongesPris;
    }

    public void setNbJoursCongesPris(int nbJoursCongesPris) {
        this.nbJoursCongesPris = nbJoursCongesPris;
    }

    public abstract int joursCongesRestants();
}
