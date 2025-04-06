package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Inscripcion {
    private Alumno alumno;
    private List <Materia> materiasAinscribir;


    public boolean cumpleTodasLasCorrelativas () {
        /*return this.materiasAinscribir.stream().allMatch(
                materia -> this.alumno.cumpleCorrelativas(materia)
        );*/
        for (Materia materia : this.materiasAinscribir) {
            if (!alumno.cumpleCorrelativas(materia)) {
                return false;
            }
        }

        return true;
    }

    public boolean aprobada() {
        return cumpleTodasLasCorrelativas();
    }


    public void agregarMateria(Materia materia) {
        this.materiasAinscribir.add(materia);
    }
}
