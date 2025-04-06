package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IncripcionTest {
    @Test
    @DisplayName("Test de correlativas cumplidas")
    void cumpleCorrelativas1() {
        Alumno alumno = new Alumno( "Juan", "Pérez", "12345678");
        Materia matematica = new Materia("Matematica", 3);
        Materia fisica = new Materia("Fisica", 4);
        Materia ads = new Materia("ADS", 4);
        Materia analisis = new Materia("Analisis", 5);

        // Agrego correlativas a Análisis
        analisis.agregarCorrelativa(fisica, matematica);


        // Agrego al alumno sus materias aprobadas
        alumno.agregarMateriaAprobada(matematica);
        alumno.agregarMateriaAprobada(fisica);

        Incripcion inscripcion = new Incripcion(alumno, analisis);
        inscripcion.agregarMateria(analisis);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test de correlativas no cumplidas")
    void cumpleCorrelativas2() {
        Alumno alumno = new Alumno( "Juan", "Pérez", "12345678");
        Materia matematica = new Materia("Matematica", 3);
        Materia fisica = new Materia("Fisica", 4);
        Materia ads = new Materia("ADS", 4);
        Materia analisis = new Materia("Analisis", 5);

        // Agrego correlativas a Análisis
        analisis.agregarCorrelativa(fisica, matematica, ads);


        // Agrego al alumno sus materias aprobadas
        alumno.agregarMateriaAprobada(matematica);
        alumno.agregarMateriaAprobada(fisica);

        Incripcion inscripcion = new Incripcion(alumno, analisis);
        inscripcion.agregarMateria(analisis);

        Assertions.assertTrue(inscripcion.aprobada());
    }


}