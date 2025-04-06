package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private List <Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    public Boolean tieneMateriaAprobada(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
