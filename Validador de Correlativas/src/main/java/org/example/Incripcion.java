package org.example;

import java.util.ArrayList;
import java.util.List;

public class Incripcion {
    private Alumno alumno;
    private List <Materia> materiasAinscribir;


    public Incripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materiasAinscribir = new ArrayList<>();
    }

    public boolean cumpleCorrelativas () {
        List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();

        for (Materia materia : materiasAinscribir) {
            for (Materia correlativa : materia.getMateriasCorrelativas()) {
                boolean estaAprobada = false;

                for (Materia aprobada : materiasAprobadas) {
                    if (correlativa.getNombre().equalsIgnoreCase(aprobada.getNombre())) {
                        estaAprobada = true;
                        break;
                    }
                }

                if (!estaAprobada) {
                    return false; // Si falta una correlativa, no cumple
                }
            }
        }

        return true;
    }

    public boolean aprobada() {
        return cumpleCorrelativas();
    }


    public void agregarMateria(Materia materia) {
        this.materiasAinscribir.add(materia);
    }
}
