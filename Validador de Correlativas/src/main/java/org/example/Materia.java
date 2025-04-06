package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer horas;
    //private MateriasCorrelativas materiasCorrelativas;
    private List <Materia> materiasCorrelativas;

    public Materia(String nombre, Integer horas) {
        this.nombre = nombre;
        this.horas = horas;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }


    public void agregarCorrelativa(Materia ... materias) {
        Collections.addAll(this.materiasCorrelativas, materias);

    }




}
