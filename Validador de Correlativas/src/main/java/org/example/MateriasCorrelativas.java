package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MateriasCorrelativas {
    private List<Materia> materiasNecesarias;

    public MateriasCorrelativas() {
        this.materiasNecesarias = new ArrayList<>();
    }

    public void agregarMateriasCorrelativas(Materia ... materias) {
        Collections.addAll(this.materiasNecesarias, materias);

    }

    public List<Materia> getMateriasNecesarias() {
        return materiasNecesarias;
    }
}
