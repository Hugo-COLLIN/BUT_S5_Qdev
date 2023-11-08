public abstract class Personnel {
    private String nom;
    private int age;
    public Personnel(String name, int age) {
        this.nom = name;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
