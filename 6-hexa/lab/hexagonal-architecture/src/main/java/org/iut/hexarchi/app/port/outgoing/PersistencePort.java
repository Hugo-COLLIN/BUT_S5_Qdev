package org.iut.hexarchi.app.port.outgoing;

import org.iut.hexarchi.domain.entities.DomainValues;

public interface PersistencePort {
    DomainValues findAll();
}
