package org.iut.hexarchi.infra.repository;

import org.iut.hexarchi.domain.entities.DomainValues;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class PersistenceRepository {
    public DomainValues findAll() throws IOException {
//        try(var file = Files.lines(Paths.get("files.txt"))) {
//            return new DomainValues(file.map(Integer::parseInt).toList());
//        }
//        catch (IOException e) {
//            return new DomainValues(Collections.emptyList());
//        }
        return new DomainValues(List.of(1, 2, 3, 4, 5));
    }
}
