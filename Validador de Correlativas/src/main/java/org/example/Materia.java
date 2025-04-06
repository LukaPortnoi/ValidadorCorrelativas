package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Materia {
    private String nombre;
    private Integer horas;
    private List <Materia> materiasCorrelativas;


    public void agregarCorrelativa(Materia ... materias) {
        Collections.addAll(this.materiasCorrelativas, materias);

    }

}
