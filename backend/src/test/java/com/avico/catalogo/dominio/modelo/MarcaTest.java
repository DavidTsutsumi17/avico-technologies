package com.avico.catalogo.dominio.modelo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarcaTest {

    @Test
    void crearMarca() {

        //Given
        String marca = "Marca";

        //When
        Marca marcaObj = new Marca(marca);

        //Then
        assertEquals("Marca", marcaObj.marca());
    }

    @Test
    void crearMarcaDeberiaLanzarExcepcionCuandoLaMarcaEsNula() {

        //Given
        String marca = null;

        //When
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Marca(marca));

        //Then
        assertEquals("La marca es obligatoria.", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void crearMarcaDeberiaLanzarExcepcionCuandoLaMarcaEstaVacia(String marca) {
        //Given

        //When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Marca(marca));

        //When
        assertEquals("La marca no puede estar vacía.", exception.getMessage());

    }
}
