package org.iut.hexarchi.app.service;

import org.iut.hexarchi.app.port.ingoing.ComputeAvgServicePort;
import org.iut.hexarchi.app.port.outgoing.PersistencePort;

public class ComputeAvgService implements ComputeAvgServicePort {

    final private PersistencePort persistencePort;

    public ComputeAvgService(PersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    @Override
    public double compute() {
        return persistencePort.findAll().sum() / persistencePort.findAll().nbElements();
    }
}
