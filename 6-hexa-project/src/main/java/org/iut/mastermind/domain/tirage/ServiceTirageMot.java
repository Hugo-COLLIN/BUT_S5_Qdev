package org.iut.mastermind.domain.tirage;

public class ServiceTirageMot {
    private final MotsRepository repository;
    private final ServiceNombreAleatoire nbAleatoire;

    public ServiceTirageMot(MotsRepository repository, ServiceNombreAleatoire nbAleatoire) {
        this.repository = repository;
        this.nbAleatoire = nbAleatoire;
    }

    // retourne le mot à l'indice renvoyé par le service nombre aléatoire
    public String tirageMotAleatoire() {
        int index = nbAleatoire.next(repository.nbMaxMots());
        return repository.getMotByIndex(index);
    }
}
