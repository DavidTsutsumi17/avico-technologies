package com.avico.catalogo.dominio.modelo;

import java.util.Objects;

public record Marca(String marca) {

    public  Marca {

        Objects.requireNonNull(marca, "La marca es obligatoria.");

        if (marca.isBlank()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
    }
}
