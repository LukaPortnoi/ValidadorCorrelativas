package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private List <Materia> materiasAprobadas;



    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }


    public Boolean cumpleCorrelativas(Materia materia) {
        List<Materia> materiasCorrelativas = materia.getMateriasCorrelativas();
        for (Materia correlativa : materiasCorrelativas) {
            if (!tieneMateriaAprobada(correlativa)) {
                return false;
            }
        }
        return true;
    }


    public Boolean tieneMateriaAprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
