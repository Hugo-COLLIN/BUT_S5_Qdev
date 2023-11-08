public abstract class Employe extends Personnel{
    private int nbJoursCongesPris;

    public Employe(String name, int age) {
        super(name, age);
    }

    public int getNbJoursCongesPris() {
        return nbJoursCongesPris;
    }

    public void setNbJoursCongesPris(int nbJoursCongesPris) {
        this.nbJoursCongesPris = nbJoursCongesPris;
    }

    public abstract int joursCongesRestants();
}
