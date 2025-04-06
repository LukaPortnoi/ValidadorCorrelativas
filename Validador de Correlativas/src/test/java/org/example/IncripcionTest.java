package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class IncripcionTest {
    @Test
    @DisplayName("Test de correlativas cumplidas")
    void cumpleCorrelativas1() {
        Materia matematica = new Materia("Matematica", 3, List.of());
        Materia fisica = new Materia("Fisica", 4, List.of(matematica));
        Materia ads = new Materia("ADS", 4, List.of(fisica)) ;
        Materia analisis = new Materia("Analisis", 5, List.of(matematica,fisica));
        Alumno alumno = new Alumno( "Juan", "Pérez", "12345678", List.of(matematica, fisica));




        // Agrego al alumno sus materias aprobadas
        alumno.agregarMateriaAprobada(matematica);
        alumno.agregarMateriaAprobada(fisica);

        Inscripcion inscripcion = new Inscripcion(alumno, analisis);
        inscripcion.agregarMateria(analisis);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test de correlativas no cumplidas")
    void cumpleCorrelativas2() {
        Materia matematica = new Materia("Matematica", 3, List.of());
        Materia fisica = new Materia("Fisica", 4, List.of(matematica));
        Materia ads = new Materia("ADS", 4, List.of(fisica)) ;
        Materia analisis = new Materia("Analisis", 5, List.of(matematica,fisica,ads));
        Alumno alumno = new Alumno( "Juan", "Pérez", "12345678", List.of(matematica, fisica));




        // Agrego al alumno sus materias aprobadas
        alumno.agregarMateriaAprobada(matematica);
        alumno.agregarMateriaAprobada(fisica);

        Inscripcion inscripcion = new Inscripcion(alumno, analisis);
        inscripcion.agregarMateria(analisis);

        Assertions.assertTrue(inscripcion.aprobada());
    }


}