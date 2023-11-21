package org.iut.hexarchi.infra.adapters;

import org.iut.hexarchi.app.port.outgoing.PersistencePort;
import org.iut.hexarchi.domain.entities.DomainValues;
import org.iut.hexarchi.infra.repository.PersistenceRepository;

public class PersistenceAdapter implements PersistencePort {
    final private PersistenceAdapter persistenceRepository;

    public PersistenceAdapter(PersistenceRepository persistenceRepository) {
        this.persistenceRepository = persistenceRepository;
    }

    @Override
    public DomainValues findAll() {
        return persistenceRepository.findAll();
    }

}
