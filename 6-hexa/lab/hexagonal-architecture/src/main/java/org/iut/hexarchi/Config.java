package org.iut.hexarchi;

import org.iut.hexarchi.app.port.ingoing.ComputeAvgServicePort;
import org.iut.hexarchi.app.service.ComputeAvgService;
import org.iut.hexarchi.infra.adapters.PersistenceAdapter;
import org.iut.hexarchi.infra.repository.PersistenceRepository;

public class Config {
    public static ComputeAvgServicePort computeAvgServicePort() {
        return new ComputeAvgService(
                new PersistenceAdapter(
                        new PersistenceRepository()
                )
        );
    }
}
