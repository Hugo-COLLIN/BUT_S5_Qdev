package org.iut.hexarchi.domain.entities;

import java.util.List;

public class DomainValues {
    final private List<Integer> values;

    public DomainValues(List<Integer> values) {
        this.values = values;
    }

    public Integer sum() {
        return values.stream().mapToInt(e -> e).sum();
    }

    public Integer nbElements() {
        return values.size();
    }
}
