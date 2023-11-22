package org.iut.mastermind.domain.tirage;

public interface MotsRepository {
    String getMotByIndex(int index);
    int nbMaxMots();
}
